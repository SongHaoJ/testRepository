package com.bean.dao;

import com.bean.model.DbCkyuser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbCkyuserMapper {
    DbCkyuser selectByCriteria(DbCkyuser DbCkyuser);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbCkyuser DbCkyuser);

    int insertByCriteria(DbCkyuser DbCkyuser);

    int updateByCriteria(DbCkyuser DbCkyuser);

    DbCkyuser selectByPrimaryKey(String sid);

    List<DbCkyuser> selectAll();
}