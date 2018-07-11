package com.bean.dao;

import com.bean.model.DbSell;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbSellMapper {
    DbSell selectByCriteria(DbSell DbSell);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbSell DbSell);

    int insertByCriteria(DbSell DbSell);

    int updateByCriteria(DbSell DbSell);

    DbSell selectByPrimaryKey(String sid);

    List<DbSell> selectAll();
}