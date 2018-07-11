package com.bean.dao;

import com.bean.model.DbCalculateTemp1;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbCalculateTemp1Mapper {
    DbCalculateTemp1 selectByCriteria(DbCalculateTemp1 DbCalculateTemp1);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbCalculateTemp1 DbCalculateTemp1);

    int insertByCriteria(DbCalculateTemp1 DbCalculateTemp1);

    int updateByCriteria(DbCalculateTemp1 DbCalculateTemp1);

    DbCalculateTemp1 selectByPrimaryKey(String sid);

    List<DbCalculateTemp1> selectAll();
}