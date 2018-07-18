package com.bean.dao;

import com.bean.model.DbCalculateTemp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbCalculateTempMapper {
    DbCalculateTemp selectByCriteria(DbCalculateTemp DbCalculateTemp);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbCalculateTemp DbCalculateTemp);

    int insertByCriteria(DbCalculateTemp DbCalculateTemp);

    int updateByCriteria(DbCalculateTemp DbCalculateTemp);

    DbCalculateTemp selectByPrimaryKey(String sid);

    List<DbCalculateTemp> selectAll();
}