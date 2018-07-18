package com.bean.dao;

import com.bean.model.DbCalculateitem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbCalculateitemMapper {
    DbCalculateitem selectByCriteria(DbCalculateitem DbCalculateitem);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbCalculateitem DbCalculateitem);

    int insertByCriteria(DbCalculateitem DbCalculateitem);

    int updateByCriteria(DbCalculateitem DbCalculateitem);

    DbCalculateitem selectByPrimaryKey(String sid);

    List<DbCalculateitem> selectAll();
}