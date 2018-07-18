package com.bean.dao;

import com.bean.model.DbProductlocationlog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbProductlocationlogMapper {
    DbProductlocationlog selectByCriteria(DbProductlocationlog DbProductlocationlog);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbProductlocationlog DbProductlocationlog);

    int insertByCriteria(DbProductlocationlog DbProductlocationlog);

    int updateByCriteria(DbProductlocationlog DbProductlocationlog);

    DbProductlocationlog selectByPrimaryKey(Long id);

    List<DbProductlocationlog> selectAll();
}