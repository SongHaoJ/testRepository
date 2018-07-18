package com.bean.dao;

import com.bean.model.DbSpaypallog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbSpaypallogMapper {
    DbSpaypallog selectByCriteria(DbSpaypallog DbSpaypallog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbSpaypallog DbSpaypallog);

    int insertByCriteria(DbSpaypallog DbSpaypallog);

    int updateByCriteria(DbSpaypallog DbSpaypallog);

    DbSpaypallog selectByPrimaryKey(String sequenceid);

    List<DbSpaypallog> selectAll();
}