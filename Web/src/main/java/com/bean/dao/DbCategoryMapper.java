package com.bean.dao;

import com.bean.model.DbCategory;
import java.util.List;
import org.springframework.stereotype.Service;

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