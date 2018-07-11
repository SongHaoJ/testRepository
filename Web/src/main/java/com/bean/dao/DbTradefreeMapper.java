package com.bean.dao;

import com.bean.model.DbTradefree;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbTradefreeMapper {
    DbTradefree selectByCriteria(DbTradefree DbTradefree);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbTradefree DbTradefree);

    int insertByCriteria(DbTradefree DbTradefree);

    int updateByCriteria(DbTradefree DbTradefree);

    DbTradefree selectByPrimaryKey(String sequenceid);

    List<DbTradefree> selectAll();
}