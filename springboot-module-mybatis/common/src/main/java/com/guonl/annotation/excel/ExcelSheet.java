package com.guonl.annotation.excel;

import org.apache.poi.hssf.util.HSSFColor;

import java.lang.annotation.*;


/**
 * Created by guonl
 * Date: 2019-06-26 18:09
 * Description: 表信息
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ExcelSheet {

    /**
     * 表名称
     *
     * @return String
     */
    String name() default "";

    /**
     * 表头/首行的颜色
     *
     * @return HSSFColorPredefined
     */
    HSSFColor.HSSFColorPredefined headColor() default HSSFColor.HSSFColorPredefined.LIGHT_GREEN;

}

