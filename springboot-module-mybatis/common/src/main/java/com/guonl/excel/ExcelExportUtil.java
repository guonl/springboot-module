package com.guonl.excel;

import com.guonl.annotation.excel.ExcelField;
import com.guonl.annotation.excel.ExcelSheet;
import com.guonl.utils.FieldReflectionUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by guonl
 * Date: 2019-06-26 18:12
 * Description: Excel导出工具
 */
@Slf4j
public class ExcelExportUtil {

    /**
     * 导出Excel对象
     *
     * @param sheetDataListArr Excel数据
     * @return Workbook
     */
    public static Workbook exportWorkbook(List<?>... sheetDataListArr) {

        // data array valid
        if (sheetDataListArr == null || sheetDataListArr.length == 0) {
            throw new RuntimeException(">>>>>>>>>>> excel error, data array can not be empty.");
        }

        // book （HSSFWorkbook=2003/xls、XSSFWorkbook=2007/xlsx）
        Workbook workbook = new HSSFWorkbook();

        // sheet
        for (List<?> dataList : sheetDataListArr) {
            makeSheet(workbook, dataList);
        }

        return workbook;
    }

    @SuppressWarnings("all")
    private static void makeSheet(Workbook workbook, List<?> sheetDataList) {
        // data
        if (sheetDataList == null || sheetDataList.size() == 0) {
            throw new RuntimeException(">>>>>>>>>>> excel error, data can not be empty.");
        }

        // sheet
        Class<?> sheetClass = sheetDataList.get(0).getClass();
        ExcelSheet excelSheet = sheetClass.getAnnotation(ExcelSheet.class);

        String sheetName = sheetDataList.get(0).getClass().getSimpleName();
        int headColorIndex = -1;
        if (excelSheet != null) {
            if (excelSheet.name() != null && excelSheet.name().trim().length() > 0) {
                sheetName = excelSheet.name().trim();
            }
            headColorIndex = excelSheet.headColor().getIndex();
        }

        Sheet existSheet = workbook.getSheet(sheetName);
        if (existSheet != null) {
            for (int i = 2; i <= 1000; i++) {
                String newSheetName = sheetName.concat(String.valueOf(i));  // avoid sheetName repetition
                existSheet = workbook.getSheet(newSheetName);
                if (existSheet == null) {
                    sheetName = newSheetName;
                    break;
                } else {
                    continue;
                }
            }
        }

        Sheet sheet = workbook.createSheet(sheetName);

        // sheet field
        List<Field> fields = new ArrayList<Field>();
        if (sheetClass.getDeclaredFields() != null && sheetClass.getDeclaredFields().length > 0) {
            for (Field field : sheetClass.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers())) {
                    continue;
                }
                fields.add(field);
            }
        }

        if (fields == null || fields.size() == 0) {
            throw new RuntimeException(">>>>>>>>>>> excel error, data field can not be empty.");
        }

        // sheet header row
        CellStyle[] fieldDataStyleArr = new CellStyle[fields.size()];
        int[] fieldWidthArr = new int[fields.size()];
        Row headRow = sheet.createRow(0);
        for (int i = 0; i < fields.size(); i++) {

            // field
            Field field = fields.get(i);
            ExcelField excelField = field.getAnnotation(ExcelField.class);

            String fieldName = field.getName();
            int fieldWidth = 0;
            HorizontalAlignment align = null;
            if (excelField != null) {
                if (excelField.name() != null && excelField.name().trim().length() > 0) {
                    fieldName = excelField.name().trim();
                }
                fieldWidth = excelField.width();
                align = excelField.align();
            }

            // field width
            fieldWidthArr[i] = fieldWidth;

            // head-style、field-data-style
            CellStyle fieldDataStyle = workbook.createCellStyle();
            if (align != null) {
                fieldDataStyle.setAlignment(align);
            }
            fieldDataStyleArr[i] = fieldDataStyle;

            CellStyle headStyle = workbook.createCellStyle();
            headStyle.cloneStyleFrom(fieldDataStyle);
            if (headColorIndex > -1) {
                headStyle.setFillForegroundColor((short) headColorIndex);
                headStyle.setFillBackgroundColor((short) headColorIndex);
                headStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            }

            // head-field data
            Cell cellX = headRow.createCell(i, CellType.STRING);
            cellX.setCellStyle(headStyle);
            cellX.setCellValue(String.valueOf(fieldName));
        }

        // sheet data rows
        for (int dataIndex = 0; dataIndex < sheetDataList.size(); dataIndex++) {
            int rowIndex = dataIndex + 1;
            Object rowData = sheetDataList.get(dataIndex);

            Row rowX = sheet.createRow(rowIndex);

            for (int i = 0; i < fields.size(); i++) {
                Field field = fields.get(i);
                try {
                    field.setAccessible(true);
                    Object fieldValue = field.get(rowData);

                    String fieldValueString = FieldReflectionUtil.formatValue(field, fieldValue);

                    Cell cellX = rowX.createCell(i, CellType.STRING);
                    cellX.setCellValue(fieldValueString);
                    cellX.setCellStyle(fieldDataStyleArr[i]);
                } catch (IllegalAccessException e) {
                    log.error(e.getMessage(), e);
                    throw new RuntimeException(e);
                }
            }
        }

        // sheet finally
        for (int i = 0; i < fields.size(); i++) {
            int fieldWidth = fieldWidthArr[i];
            if (fieldWidth > 0) {
                sheet.setColumnWidth(i, fieldWidth);
            } else {
                sheet.autoSizeColumn((short) i);
            }
        }
    }

    /**
     * 导出Excel文件到磁盘
     *
     * @param filePath
     * @param sheetDataListArr 数据，可变参数，如多个参数则代表导出多张Sheet
     */
    public static void exportToFile(String filePath, List<?>... sheetDataListArr) {
        // workbook
        Workbook workbook = exportWorkbook(sheetDataListArr);

        FileOutputStream fileOutputStream = null;
        try {
            // workbook 2 FileOutputStream
            fileOutputStream = new FileOutputStream(filePath);
            workbook.write(fileOutputStream);

            // flush
            fileOutputStream.flush();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (Exception e) {
                log.error(e.getMessage(), e);
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * 导出Excel字节数据
     *
     * @param sheetDataListArr
     * @return byte[]
     */
    public static byte[] exportToBytes(List<?>... sheetDataListArr) {
        // workbook
        Workbook workbook = exportWorkbook(sheetDataListArr);

        ByteArrayOutputStream byteArrayOutputStream = null;
        byte[] result = null;
        try {
            // workbook 2 ByteArrayOutputStream
            byteArrayOutputStream = new ByteArrayOutputStream();
            workbook.write(byteArrayOutputStream);

            // flush
            byteArrayOutputStream.flush();

            result = byteArrayOutputStream.toByteArray();
            return result;
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new RuntimeException(e);
        } finally {
            try {
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
            } catch (Exception e) {
                log.error(e.getMessage(), e);
                throw new RuntimeException(e);
            }
        }
    }

}
