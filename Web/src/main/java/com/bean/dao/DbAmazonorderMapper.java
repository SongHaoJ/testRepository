package com.bean.dao;

import com.bean.model.DbAmazonorder;
import java.util.List;
import org.springframework.stereotype.Service;

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