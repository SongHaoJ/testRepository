package com.bean.dao;

import com.bean.model.DbDhorderinfo;
import java.util.List;
import org.springframework.stereotype.Service;

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