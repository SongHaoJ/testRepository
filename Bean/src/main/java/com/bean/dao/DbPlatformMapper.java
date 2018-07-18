package com.bean.dao;

import com.bean.model.DbPlatform;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbPlatformMapper {
    DbPlatform selectByCriteria(DbPlatform DbPlatform);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbPlatform DbPlatform);

    int insertByCriteria(DbPlatform DbPlatform);

    int updateByCriteria(DbPlatform DbPlatform);

    DbPlatform selectByPrimaryKey(String sequenceid);

    List<DbPlatform> selectAll();
}