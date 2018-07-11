package com.bean.dao;

import com.bean.model.DbCalculateall;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

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