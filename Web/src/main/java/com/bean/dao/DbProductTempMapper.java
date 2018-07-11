package com.bean.dao;

import com.bean.model.DbProductTemp;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbProductTempMapper {
    DbProductTemp selectByCriteria(DbProductTemp DbProductTemp);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProductTemp DbProductTemp);

    int insertByCriteria(DbProductTemp DbProductTemp);

    int updateByCriteria(DbProductTemp DbProductTemp);

    DbProductTemp selectByPrimaryKey(String sequenceid);

    List<DbProductTemp> selectAll();
}