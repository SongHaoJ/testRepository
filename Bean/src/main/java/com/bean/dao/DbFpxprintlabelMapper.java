package com.bean.dao;

import com.bean.model.DbFpxprintlabel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbFpxprintlabelMapper {
    DbFpxprintlabel selectByCriteria(DbFpxprintlabel DbFpxprintlabel);

    void deleteByPrimaryKey(String ORDERID);

    void deleteByCriteria(DbFpxprintlabel DbFpxprintlabel);

    int insertByCriteria(DbFpxprintlabel DbFpxprintlabel);

    int updateByCriteria(DbFpxprintlabel DbFpxprintlabel);

    DbFpxprintlabel selectByPrimaryKey(String orderid);

    List<DbFpxprintlabel> selectAll();
}