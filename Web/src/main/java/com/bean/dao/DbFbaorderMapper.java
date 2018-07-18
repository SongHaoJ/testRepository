package com.bean.dao;

import com.bean.model.DbFbaorder;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbFbaorderMapper {
    DbFbaorder selectByCriteria(DbFbaorder DbFbaorder);

    void deleteByPrimaryKey(String ORDERID);

    void deleteByCriteria(DbFbaorder DbFbaorder);

    int insertByCriteria(DbFbaorder DbFbaorder);

    int updateByCriteria(DbFbaorder DbFbaorder);

    DbFbaorder selectByPrimaryKey(String orderid);

    List<DbFbaorder> selectAll();
}