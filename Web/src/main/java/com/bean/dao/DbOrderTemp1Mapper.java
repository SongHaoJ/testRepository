package com.bean.dao;

import com.bean.model.DbOrderTemp1;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbOrderTemp1Mapper {
    DbOrderTemp1 selectByCriteria(DbOrderTemp1 DbOrderTemp1);

    void deleteByPrimaryKey(String ORDERID);

    void deleteByCriteria(DbOrderTemp1 DbOrderTemp1);

    int insertByCriteria(DbOrderTemp1 DbOrderTemp1);

    int updateByCriteria(DbOrderTemp1 DbOrderTemp1);

    DbOrderTemp1 selectByPrimaryKey(String orderid);

    List<DbOrderTemp1> selectAll();
}