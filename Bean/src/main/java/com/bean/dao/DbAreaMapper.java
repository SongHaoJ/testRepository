package com.bean.dao;

import com.bean.model.DbArea;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbAreaMapper {
    DbArea selectByCriteria(DbArea DbArea);

    void deleteByPrimaryKey(String AREA);

    void deleteByCriteria(DbArea DbArea);

    int insertByCriteria(DbArea DbArea);

    int updateByCriteria(DbArea DbArea);

    DbArea selectByPrimaryKey(String area);

    List<DbArea> selectAll();
}