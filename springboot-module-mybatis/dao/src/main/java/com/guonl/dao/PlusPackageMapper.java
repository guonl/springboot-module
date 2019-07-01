package com.guonl.dao;

import com.guonl.model.PlusPackage;
import com.guonl.model.PlusPackageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlusPackageMapper {
    long countByExample(PlusPackageExample example);

    int deleteByExample(PlusPackageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PlusPackage record);

    int insertSelective(@Param("record") PlusPackage record, @Param("selective") PlusPackage.Column ... selective);

    PlusPackage selectOneByExample(PlusPackageExample example);

    List<PlusPackage> selectByExample(PlusPackageExample example);

    PlusPackage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PlusPackage record, @Param("example") PlusPackageExample example, @Param("selective") PlusPackage.Column ... selective);

    int updateByExample(@Param("record") PlusPackage record, @Param("example") PlusPackageExample example);

    int updateByPrimaryKeySelective(@Param("record") PlusPackage record, @Param("selective") PlusPackage.Column ... selective);

    int updateByPrimaryKey(PlusPackage record);

    int batchInsert(@Param("list") List<PlusPackage> list);

    int batchInsertSelective(@Param("list") List<PlusPackage> list, @Param("selective") PlusPackage.Column ... selective);
}