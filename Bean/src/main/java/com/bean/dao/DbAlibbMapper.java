package com.bean.dao;

import com.bean.model.DbAlibb;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbAlibbMapper {
    DbAlibb selectByCriteria(DbAlibb DbAlibb);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbAlibb DbAlibb);

    int insertByCriteria(DbAlibb DbAlibb);

    int updateByCriteria(DbAlibb DbAlibb);

    DbAlibb selectByPrimaryKey(String sid);

    List<DbAlibb> selectAll();
}