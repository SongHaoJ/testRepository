package com.bean.dao;

import com.bean.model.DbCategory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbCategoryMapper {
    DbCategory selectByCriteria(DbCategory DbCategory);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbCategory DbCategory);

    int insertByCriteria(DbCategory DbCategory);

    int updateByCriteria(DbCategory DbCategory);

    DbCategory selectByPrimaryKey(String sequenceid);

    List<DbCategory> selectAll();
}