package com.bean.dao;

import com.bean.model.DbBeiubuser;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbBeiubuserMapper {
    DbBeiubuser selectByCriteria(DbBeiubuser DbBeiubuser);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbBeiubuser DbBeiubuser);

    int insertByCriteria(DbBeiubuser DbBeiubuser);

    int updateByCriteria(DbBeiubuser DbBeiubuser);

    DbBeiubuser selectByPrimaryKey(String sid);

    List<DbBeiubuser> selectAll();
}