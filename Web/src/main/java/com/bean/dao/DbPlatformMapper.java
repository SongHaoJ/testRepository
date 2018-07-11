package com.bean.dao;

import com.bean.model.DbPlatform;
import java.util.List;
import org.springframework.stereotype.Service;

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