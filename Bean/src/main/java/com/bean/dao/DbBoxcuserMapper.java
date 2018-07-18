package com.bean.dao;

import com.bean.model.DbBoxcuser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbBoxcuserMapper {
    DbBoxcuser selectByCriteria(DbBoxcuser DbBoxcuser);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbBoxcuser DbBoxcuser);

    int insertByCriteria(DbBoxcuser DbBoxcuser);

    int updateByCriteria(DbBoxcuser DbBoxcuser);

    DbBoxcuser selectByPrimaryKey(String sid);

    List<DbBoxcuser> selectAll();
}