package com.guonl.dao;

import com.guonl.model.PlusMalls;
import com.guonl.model.PlusMallsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlusMallsMapper {
    long countByExample(PlusMallsExample example);

    int deleteByExample(PlusMallsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PlusMalls record);

    int insertSelective(@Param("record") PlusMalls record, @Param("selective") PlusMalls.Column ... selective);

    PlusMalls selectOneByExample(PlusMallsExample example);

    List<PlusMalls> selectByExample(PlusMallsExample example);

    PlusMalls selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PlusMalls record, @Param("example") PlusMallsExample example, @Param("selective") PlusMalls.Column ... selective);

    int updateByExample(@Param("record") PlusMalls record, @Param("example") PlusMallsExample example);

    int updateByPrimaryKeySelective(@Param("record") PlusMalls record, @Param("selective") PlusMalls.Column ... selective);

    int updateByPrimaryKey(PlusMalls record);

    int batchInsert(@Param("list") List<PlusMalls> list);

    int batchInsertSelective(@Param("list") List<PlusMalls> list, @Param("selective") PlusMalls.Column ... selective);
}