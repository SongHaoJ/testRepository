package com.bean.dao;

import com.bean.model.DbCalculateall;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbCalculateallMapper {
    DbCalculateall selectByCriteria(DbCalculateall DbCalculateall);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbCalculateall DbCalculateall);

    int insertByCriteria(DbCalculateall DbCalculateall);

    int updateByCriteria(DbCalculateall DbCalculateall);

    DbCalculateall selectByPrimaryKey(BigDecimal sequenceid);

    List<DbCalculateall> selectAll();
}