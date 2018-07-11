package com.bean.dao;

import com.bean.model.DbCustomlable;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbCustomlableMapper {
    DbCustomlable selectByCriteria(DbCustomlable DbCustomlable);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbCustomlable DbCustomlable);

    int insertByCriteria(DbCustomlable DbCustomlable);

    int updateByCriteria(DbCustomlable DbCustomlable);

    DbCustomlable selectByPrimaryKey(String sequenceid);

    List<DbCustomlable> selectAll();
}