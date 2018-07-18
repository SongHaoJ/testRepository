package com.bean.dao;

import com.bean.model.DbQueryrobot;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbQueryrobotMapper {
    DbQueryrobot selectByCriteria(DbQueryrobot DbQueryrobot);

    void deleteByPrimaryKey(String ORDERID);

    void deleteByCriteria(DbQueryrobot DbQueryrobot);

    int insertByCriteria(DbQueryrobot DbQueryrobot);

    int updateByCriteria(DbQueryrobot DbQueryrobot);

    DbQueryrobot selectByPrimaryKey(String orderid);

    List<DbQueryrobot> selectAll();
}