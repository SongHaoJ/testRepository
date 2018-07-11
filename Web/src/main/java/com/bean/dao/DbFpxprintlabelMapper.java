package com.bean.dao;

import com.bean.model.DbFpxprintlabel;
import java.util.List;
import org.springframework.stereotype.Service;

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