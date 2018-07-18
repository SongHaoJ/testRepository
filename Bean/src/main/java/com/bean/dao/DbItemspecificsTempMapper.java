package com.bean.dao;

import com.bean.model.DbItemspecificsTemp;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbItemspecificsTempMapper {
    DbItemspecificsTemp selectByCriteria(DbItemspecificsTemp DbItemspecificsTemp);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbItemspecificsTemp DbItemspecificsTemp);

    int insertByCriteria(DbItemspecificsTemp DbItemspecificsTemp);

    int updateByCriteria(DbItemspecificsTemp DbItemspecificsTemp);

    DbItemspecificsTemp selectByPrimaryKey(BigDecimal sid);

    List<DbItemspecificsTemp> selectAll();
}