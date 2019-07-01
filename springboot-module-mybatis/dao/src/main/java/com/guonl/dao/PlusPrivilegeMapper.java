package com.guonl.dao;

import com.guonl.model.PlusPrivilege;
import com.guonl.model.PlusPrivilegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlusPrivilegeMapper {
    long countByExample(PlusPrivilegeExample example);

    int deleteByExample(PlusPrivilegeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PlusPrivilege record);

    int insertSelective(@Param("record") PlusPrivilege record, @Param("selective") PlusPrivilege.Column ... selective);

    PlusPrivilege selectOneByExample(PlusPrivilegeExample example);

    List<PlusPrivilege> selectByExample(PlusPrivilegeExample example);

    PlusPrivilege selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PlusPrivilege record, @Param("example") PlusPrivilegeExample example, @Param("selective") PlusPrivilege.Column ... selective);

    int updateByExample(@Param("record") PlusPrivilege record, @Param("example") PlusPrivilegeExample example);

    int updateByPrimaryKeySelective(@Param("record") PlusPrivilege record, @Param("selective") PlusPrivilege.Column ... selective);

    int updateByPrimaryKey(PlusPrivilege record);

    int batchInsert(@Param("list") List<PlusPrivilege> list);

    int batchInsertSelective(@Param("list") List<PlusPrivilege> list, @Param("selective") PlusPrivilege.Column ... selective);
}