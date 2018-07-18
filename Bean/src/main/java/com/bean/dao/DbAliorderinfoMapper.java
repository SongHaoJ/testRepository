package com.bean.dao;

import com.bean.model.DbAliorderinfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbAliorderinfoMapper {
    DbAliorderinfo selectByCriteria(DbAliorderinfo DbAliorderinfo);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbAliorderinfo DbAliorderinfo);

    int insertByCriteria(DbAliorderinfo DbAliorderinfo);

    int updateByCriteria(DbAliorderinfo DbAliorderinfo);

    DbAliorderinfo selectByPrimaryKey(String sequenceid);

    List<DbAliorderinfo> selectAll();
}