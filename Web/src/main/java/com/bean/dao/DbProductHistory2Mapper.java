package com.bean.dao;

import com.bean.model.DbProductHistory2;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbProductHistory2Mapper {
    DbProductHistory2 selectByCriteria(DbProductHistory2 DbProductHistory2);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProductHistory2 DbProductHistory2);

    int insertByCriteria(DbProductHistory2 DbProductHistory2);

    int updateByCriteria(DbProductHistory2 DbProductHistory2);

    DbProductHistory2 selectByPrimaryKey(BigDecimal sequenceid);

    List<DbProductHistory2> selectAll();
}