package com.bean.dao;

import com.bean.model.StatHotproduct;
import org.apache.ibatis.annotations.Param;

public interface StatHotproductMapper {
    int deleteByPrimaryKey(@Param("yyyymmdd") String yyyymmdd, @Param("shoptypeid") String shoptypeid, @Param("productid") String productid);

    int insert(StatHotproduct record);

    int insertSelective(StatHotproduct record);

    StatHotproduct selectByPrimaryKey(@Param("yyyymmdd") String yyyymmdd, @Param("shoptypeid") String shoptypeid, @Param("productid") String productid);

    int updateByPrimaryKeySelective(StatHotproduct record);

    int updateByPrimaryKey(StatHotproduct record);
}