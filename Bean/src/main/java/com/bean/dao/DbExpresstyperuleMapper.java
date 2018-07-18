package com.bean.dao;

import com.bean.model.DbExpresstyperule;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbExpresstyperuleMapper {
    DbExpresstyperule selectByCriteria(DbExpresstyperule DbExpresstyperule);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbExpresstyperule DbExpresstyperule);

    int insertByCriteria(DbExpresstyperule DbExpresstyperule);

    int updateByCriteria(DbExpresstyperule DbExpresstyperule);

    DbExpresstyperule selectByPrimaryKey(BigDecimal sid);

    List<DbExpresstyperule> selectAll();
}