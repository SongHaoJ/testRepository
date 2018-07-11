package com.bean.dao;

import com.bean.model.DbExpressblack;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbExpressblackMapper {
    DbExpressblack selectByCriteria(DbExpressblack DbExpressblack);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbExpressblack DbExpressblack);

    int insertByCriteria(DbExpressblack DbExpressblack);

    int updateByCriteria(DbExpressblack DbExpressblack);

    DbExpressblack selectByPrimaryKey(BigDecimal sequenceid);

    List<DbExpressblack> selectAll();
}