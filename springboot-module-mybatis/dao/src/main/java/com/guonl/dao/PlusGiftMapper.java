package com.guonl.dao;

import com.guonl.model.PlusGift;
import com.guonl.model.PlusGiftExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlusGiftMapper {
    long countByExample(PlusGiftExample example);

    int deleteByExample(PlusGiftExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PlusGift record);

    int insertSelective(@Param("record") PlusGift record, @Param("selective") PlusGift.Column ... selective);

    PlusGift selectOneByExample(PlusGiftExample example);

    List<PlusGift> selectByExample(PlusGiftExample example);

    PlusGift selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PlusGift record, @Param("example") PlusGiftExample example, @Param("selective") PlusGift.Column ... selective);

    int updateByExample(@Param("record") PlusGift record, @Param("example") PlusGiftExample example);

    int updateByPrimaryKeySelective(@Param("record") PlusGift record, @Param("selective") PlusGift.Column ... selective);

    int updateByPrimaryKey(PlusGift record);

    int batchInsert(@Param("list") List<PlusGift> list);

    int batchInsertSelective(@Param("list") List<PlusGift> list, @Param("selective") PlusGift.Column ... selective);
}