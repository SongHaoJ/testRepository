package com.bean.dao;

import com.bean.model.DbWytuser;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbWytuserMapper {
    DbWytuser selectByCriteria(DbWytuser DbWytuser);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbWytuser DbWytuser);

    int insertByCriteria(DbWytuser DbWytuser);

    int updateByCriteria(DbWytuser DbWytuser);

    DbWytuser selectByPrimaryKey(String sid);

    List<DbWytuser> selectAll();
}