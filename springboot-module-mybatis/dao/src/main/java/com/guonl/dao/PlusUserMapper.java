package com.guonl.dao;

import com.guonl.model.PlusUser;
import com.guonl.model.PlusUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlusUserMapper {
    long countByExample(PlusUserExample example);

    int deleteByExample(PlusUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PlusUser record);

    int insertSelective(@Param("record") PlusUser record, @Param("selective") PlusUser.Column ... selective);

    PlusUser selectOneByExample(PlusUserExample example);

    List<PlusUser> selectByExample(PlusUserExample example);

    PlusUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PlusUser record, @Param("example") PlusUserExample example, @Param("selective") PlusUser.Column ... selective);

    int updateByExample(@Param("record") PlusUser record, @Param("example") PlusUserExample example);

    int updateByPrimaryKeySelective(@Param("record") PlusUser record, @Param("selective") PlusUser.Column ... selective);

    int updateByPrimaryKey(PlusUser record);

    int batchInsert(@Param("list") List<PlusUser> list);

    int batchInsertSelective(@Param("list") List<PlusUser> list, @Param("selective") PlusUser.Column ... selective);
}