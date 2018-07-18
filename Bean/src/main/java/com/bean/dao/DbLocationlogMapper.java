package com.bean.dao;

import com.bean.model.DbLocationlog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbLocationlogMapper {
    DbLocationlog selectByCriteria(DbLocationlog DbLocationlog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbLocationlog DbLocationlog);

    int insertByCriteria(DbLocationlog DbLocationlog);

    int updateByCriteria(DbLocationlog DbLocationlog);

    DbLocationlog selectByPrimaryKey(String sequenceid);

    List<DbLocationlog> selectAll();
}