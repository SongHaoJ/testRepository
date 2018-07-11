package com.bean.dao;

import com.bean.model.DbArea;
import java.util.List;
import org.springframework.stereotype.Service;

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