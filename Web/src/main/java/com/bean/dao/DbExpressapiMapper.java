package com.bean.dao;

import com.bean.model.DbExpressapi;
import java.util.List;
import org.springframework.stereotype.Service;

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