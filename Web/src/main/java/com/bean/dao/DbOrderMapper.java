package com.bean.dao;

import com.bean.model.DbOrder;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbOrderMapper {
    DbOrder selectByCriteria(DbOrder DbOrder);

    void deleteByPrimaryKey(String ORDERID);

    void deleteByCriteria(DbOrder DbOrder);

    int insertByCriteria(DbOrder DbOrder);

    int updateByCriteria(DbOrder DbOrder);

    DbOrder selectByPrimaryKey(String orderid);

    List<DbOrder> selectAll();
}