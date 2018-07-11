package com.bean.dao;

import com.bean.model.DbSellTemp1;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbSellTemp1Mapper {
    DbSellTemp1 selectByCriteria(DbSellTemp1 DbSellTemp1);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbSellTemp1 DbSellTemp1);

    int insertByCriteria(DbSellTemp1 DbSellTemp1);

    int updateByCriteria(DbSellTemp1 DbSellTemp1);

    DbSellTemp1 selectByPrimaryKey(String sid);

    List<DbSellTemp1> selectAll();
}