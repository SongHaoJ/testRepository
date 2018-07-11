package com.bean.dao;

import com.bean.model.DbFpxconfig;
import java.util.List;
import org.springframework.stereotype.Service;

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