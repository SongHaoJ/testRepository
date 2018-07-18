package com.bean.dao;

import com.bean.model.DbHuahanseller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbHuahansellerMapper {
    DbHuahanseller selectByCriteria(DbHuahanseller DbHuahanseller);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbHuahanseller DbHuahanseller);

    int insertByCriteria(DbHuahanseller DbHuahanseller);

    int updateByCriteria(DbHuahanseller DbHuahanseller);

    DbHuahanseller selectByPrimaryKey(String sid);

    List<DbHuahanseller> selectAll();
}