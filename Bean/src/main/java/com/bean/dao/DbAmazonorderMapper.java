package com.bean.dao;

import com.bean.model.DbAmazonorder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbAmazonorderMapper {
    DbAmazonorder selectByCriteria(DbAmazonorder DbAmazonorder);

    void deleteByPrimaryKey(String ORDERID);

    void deleteByCriteria(DbAmazonorder DbAmazonorder);

    int insertByCriteria(DbAmazonorder DbAmazonorder);

    int updateByCriteria(DbAmazonorder DbAmazonorder);

    DbAmazonorder selectByPrimaryKey(String orderid);

    List<DbAmazonorder> selectAll();
}