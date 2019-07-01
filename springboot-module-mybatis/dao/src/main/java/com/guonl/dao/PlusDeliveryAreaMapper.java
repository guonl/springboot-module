package com.guonl.dao;

import com.guonl.model.PlusDeliveryArea;
import com.guonl.model.PlusDeliveryAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlusDeliveryAreaMapper {
    long countByExample(PlusDeliveryAreaExample example);

    int deleteByExample(PlusDeliveryAreaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PlusDeliveryArea record);

    int insertSelective(@Param("record") PlusDeliveryArea record, @Param("selective") PlusDeliveryArea.Column ... selective);

    PlusDeliveryArea selectOneByExample(PlusDeliveryAreaExample example);

    List<PlusDeliveryArea> selectByExample(PlusDeliveryAreaExample example);

    PlusDeliveryArea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PlusDeliveryArea record, @Param("example") PlusDeliveryAreaExample example, @Param("selective") PlusDeliveryArea.Column ... selective);

    int updateByExample(@Param("record") PlusDeliveryArea record, @Param("example") PlusDeliveryAreaExample example);

    int updateByPrimaryKeySelective(@Param("record") PlusDeliveryArea record, @Param("selective") PlusDeliveryArea.Column ... selective);

    int updateByPrimaryKey(PlusDeliveryArea record);

    int batchInsert(@Param("list") List<PlusDeliveryArea> list);

    int batchInsertSelective(@Param("list") List<PlusDeliveryArea> list, @Param("selective") PlusDeliveryArea.Column ... selective);
}