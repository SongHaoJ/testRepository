package com.bean.dao;

import com.bean.model.DbExpressapi;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbExpressapiMapper {
    DbExpressapi selectByCriteria(DbExpressapi DbExpressapi);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbExpressapi DbExpressapi);

    int insertByCriteria(DbExpressapi DbExpressapi);

    int updateByCriteria(DbExpressapi DbExpressapi);

    DbExpressapi selectByPrimaryKey(Integer id);

    List<DbExpressapi> selectAll();
}