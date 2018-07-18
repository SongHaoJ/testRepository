package com.bean.dao;

import com.bean.model.DbItemresult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbItemresultMapper {
    DbItemresult selectByCriteria(DbItemresult DbItemresult);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbItemresult DbItemresult);

    int insertByCriteria(DbItemresult DbItemresult);

    int updateByCriteria(DbItemresult DbItemresult);

    DbItemresult selectByPrimaryKey(String sid);

    List<DbItemresult> selectAll();
}