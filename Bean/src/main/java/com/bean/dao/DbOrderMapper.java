package com.bean.dao;

import com.bean.model.DbOrder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface DbOrderMapper {
    int deleteByPrimaryKey(String orderid) throws Exception;

    int insert(DbOrder record) throws Exception;

    int insertSelective(DbOrder record) throws Exception;

    DbOrder selectByPrimaryKey(String orderid) throws Exception;

    int updateByPrimaryKeySelective(DbOrder record) throws Exception;

    List<String> selectOrderIdByShopId(Map<String,String> params) throws Exception;

    int updateRefundOrderStatus(Map<String,String> params) throws Exception;

    List<String> selectOrderByDate(int num)throws Exception;

    List<DbOrder> selectAllByCriteria(DbOrder order);

    Map<String,String> selectIsSave(Map<String,String> params);
}