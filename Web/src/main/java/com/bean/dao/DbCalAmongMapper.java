package com.bean.dao;

import com.bean.model.DbCalAmong;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbCalAmongMapper {
    DbCalAmong selectByCriteria(DbCalAmong DbCalAmong);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbCalAmong DbCalAmong);

    int insertByCriteria(DbCalAmong DbCalAmong);

    int updateByCriteria(DbCalAmong DbCalAmong);

    DbCalAmong selectByPrimaryKey(String sequenceid);

    List<DbCalAmong> selectAll();
}