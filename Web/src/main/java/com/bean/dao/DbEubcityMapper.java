package com.bean.dao;

import com.bean.model.DbEubcity;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbEubcityMapper {
    DbEubcity selectByCriteria(DbEubcity DbEubcity);

    void deleteByPrimaryKey(String CITYID);

    void deleteByCriteria(DbEubcity DbEubcity);

    int insertByCriteria(DbEubcity DbEubcity);

    int updateByCriteria(DbEubcity DbEubcity);

    DbEubcity selectByPrimaryKey(String cityid);

    List<DbEubcity> selectAll();
}