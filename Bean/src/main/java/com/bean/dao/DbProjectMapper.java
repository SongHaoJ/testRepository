package com.bean.dao;

import com.bean.model.DbProject;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbProjectMapper {
    DbProject selectByCriteria(DbProject DbProject);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbProject DbProject);

    int insertByCriteria(DbProject DbProject);

    int updateByCriteria(DbProject DbProject);

    DbProject selectByPrimaryKey(String sid);

    List<DbProject> selectAll();
}