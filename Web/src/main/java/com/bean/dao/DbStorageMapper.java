package com.bean.dao;

import com.bean.model.DbStorage;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbStorageMapper {
    DbStorage selectByCriteria(DbStorage DbStorage);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbStorage DbStorage);

    int insertByCriteria(DbStorage DbStorage);

    int updateByCriteria(DbStorage DbStorage);

    DbStorage selectByPrimaryKey(String sequenceid);

    List<DbStorage> selectAll();
}