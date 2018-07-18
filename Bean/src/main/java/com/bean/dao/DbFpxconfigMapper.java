package com.bean.dao;

import com.bean.model.DbFpxconfig;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbFpxconfigMapper {
    DbFpxconfig selectByCriteria(DbFpxconfig DbFpxconfig);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbFpxconfig DbFpxconfig);

    int insertByCriteria(DbFpxconfig DbFpxconfig);

    int updateByCriteria(DbFpxconfig DbFpxconfig);

    DbFpxconfig selectByPrimaryKey(String sid);

    List<DbFpxconfig> selectAll();
}