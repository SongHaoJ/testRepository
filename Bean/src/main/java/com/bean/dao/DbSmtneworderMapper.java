package com.bean.dao;

import com.bean.model.DbSmtneworder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbSmtneworderMapper {
    DbSmtneworder selectByCriteria(DbSmtneworder DbSmtneworder);

    void deleteByPrimaryKey(String ORDERID);

    void deleteByCriteria(DbSmtneworder DbSmtneworder);

    int insertByCriteria(DbSmtneworder DbSmtneworder);

    int updateByCriteria(DbSmtneworder DbSmtneworder);

    DbSmtneworder selectByPrimaryKey(String orderid);

    List<DbSmtneworder> selectAll();
}