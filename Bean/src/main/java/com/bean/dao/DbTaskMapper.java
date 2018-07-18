package com.bean.dao;

import com.bean.model.DbTask;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbTaskMapper {
    DbTask selectByCriteria(DbTask DbTask);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbTask DbTask);

    int insertByCriteria(DbTask DbTask);

    int updateByCriteria(DbTask DbTask);

    DbTask selectByPrimaryKey(String sid);

    List<DbTask> selectAll();
}