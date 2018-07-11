package com.bean.dao;

import com.bean.model.DbCalculateTemp;
import java.util.List;
import org.springframework.stereotype.Service;

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