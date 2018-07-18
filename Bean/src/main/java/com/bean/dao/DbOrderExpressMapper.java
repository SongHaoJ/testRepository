package com.bean.dao;

import com.bean.model.DbOrderExpress;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbOrderExpressMapper {
    DbOrderExpress selectByCriteria(DbOrderExpress DbOrderExpress);

    void deleteByPrimaryKey(String ORDERID);

    void deleteByCriteria(DbOrderExpress DbOrderExpress);

    int insertByCriteria(DbOrderExpress DbOrderExpress);

    int updateByCriteria(DbOrderExpress DbOrderExpress);

    DbOrderExpress selectByPrimaryKey(String orderid);

    List<DbOrderExpress> selectAll();
}