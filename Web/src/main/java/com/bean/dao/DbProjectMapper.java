package com.bean.dao;

import com.bean.model.DbProject;
import java.util.List;
import org.springframework.stereotype.Service;

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