package com.bean.dao;

import com.bean.model.DbLable;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbLableMapper {
    DbLable selectByCriteria(DbLable DbLable);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbLable DbLable);

    int insertByCriteria(DbLable DbLable);

    int updateByCriteria(DbLable DbLable);

    DbLable selectByPrimaryKey(String sequenceid);

    List<DbLable> selectAll();
}