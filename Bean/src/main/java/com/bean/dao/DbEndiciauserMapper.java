package com.bean.dao;

import com.bean.model.DbEndiciauser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEndiciauserMapper {
    DbEndiciauser selectByCriteria(DbEndiciauser DbEndiciauser);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEndiciauser DbEndiciauser);

    int insertByCriteria(DbEndiciauser DbEndiciauser);

    int updateByCriteria(DbEndiciauser DbEndiciauser);

    DbEndiciauser selectByPrimaryKey(String sequenceid);

    List<DbEndiciauser> selectAll();
}