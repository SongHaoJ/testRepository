package com.bean.dao;

import com.bean.model.DbCkyskuconfig;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbCkyskuconfigMapper {
    DbCkyskuconfig selectByCriteria(DbCkyskuconfig DbCkyskuconfig);

    void deleteByPrimaryKey(String PRODUCTID);

    void deleteByCriteria(DbCkyskuconfig DbCkyskuconfig);

    int insertByCriteria(DbCkyskuconfig DbCkyskuconfig);

    int updateByCriteria(DbCkyskuconfig DbCkyskuconfig);

    DbCkyskuconfig selectByPrimaryKey(String productid);

    List<DbCkyskuconfig> selectAll();
}