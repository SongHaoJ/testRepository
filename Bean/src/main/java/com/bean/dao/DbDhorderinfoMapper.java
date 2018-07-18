package com.bean.dao;

import com.bean.model.DbDhorderinfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbDhorderinfoMapper {
    DbDhorderinfo selectByCriteria(DbDhorderinfo DbDhorderinfo);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbDhorderinfo DbDhorderinfo);

    int insertByCriteria(DbDhorderinfo DbDhorderinfo);

    int updateByCriteria(DbDhorderinfo DbDhorderinfo);

    DbDhorderinfo selectByPrimaryKey(String sequenceid);

    List<DbDhorderinfo> selectAll();
}