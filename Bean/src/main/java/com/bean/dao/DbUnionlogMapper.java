package com.bean.dao;

import com.bean.model.DbUnionlog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbUnionlogMapper {
    DbUnionlog selectByCriteria(DbUnionlog DbUnionlog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbUnionlog DbUnionlog);

    int insertByCriteria(DbUnionlog DbUnionlog);

    int updateByCriteria(DbUnionlog DbUnionlog);

    DbUnionlog selectByPrimaryKey(String sequenceid);

    List<DbUnionlog> selectAll();
}