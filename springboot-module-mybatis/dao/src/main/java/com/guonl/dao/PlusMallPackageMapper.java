package com.guonl.dao;

import com.guonl.model.PlusMallPackage;
import com.guonl.model.PlusMallPackageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlusMallPackageMapper {
    long countByExample(PlusMallPackageExample example);

    int deleteByExample(PlusMallPackageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PlusMallPackage record);

    int insertSelective(@Param("record") PlusMallPackage record, @Param("selective") PlusMallPackage.Column ... selective);

    PlusMallPackage selectOneByExample(PlusMallPackageExample example);

    List<PlusMallPackage> selectByExample(PlusMallPackageExample example);

    PlusMallPackage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PlusMallPackage record, @Param("example") PlusMallPackageExample example, @Param("selective") PlusMallPackage.Column ... selective);

    int updateByExample(@Param("record") PlusMallPackage record, @Param("example") PlusMallPackageExample example);

    int updateByPrimaryKeySelective(@Param("record") PlusMallPackage record, @Param("selective") PlusMallPackage.Column ... selective);

    int updateByPrimaryKey(PlusMallPackage record);

    int batchInsert(@Param("list") List<PlusMallPackage> list);

    int batchInsertSelective(@Param("list") List<PlusMallPackage> list, @Param("selective") PlusMallPackage.Column ... selective);
}