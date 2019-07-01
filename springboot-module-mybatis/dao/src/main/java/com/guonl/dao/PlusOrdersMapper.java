package com.guonl.dao;

import com.guonl.model.PlusOrders;
import com.guonl.model.PlusOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlusOrdersMapper {
    long countByExample(PlusOrdersExample example);

    int deleteByExample(PlusOrdersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PlusOrders record);

    int insertSelective(@Param("record") PlusOrders record, @Param("selective") PlusOrders.Column ... selective);

    PlusOrders selectOneByExample(PlusOrdersExample example);

    List<PlusOrders> selectByExample(PlusOrdersExample example);

    PlusOrders selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PlusOrders record, @Param("example") PlusOrdersExample example, @Param("selective") PlusOrders.Column ... selective);

    int updateByExample(@Param("record") PlusOrders record, @Param("example") PlusOrdersExample example);

    int updateByPrimaryKeySelective(@Param("record") PlusOrders record, @Param("selective") PlusOrders.Column ... selective);

    int updateByPrimaryKey(PlusOrders record);

    int batchInsert(@Param("list") List<PlusOrders> list);

    int batchInsertSelective(@Param("list") List<PlusOrders> list, @Param("selective") PlusOrders.Column ... selective);
}