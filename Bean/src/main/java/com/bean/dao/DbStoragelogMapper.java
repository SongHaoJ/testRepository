package com.bean.dao;

import com.bean.model.DbStoragelog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbStoragelogMapper {
    DbStoragelog selectByCriteria(DbStoragelog DbStoragelog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbStoragelog DbStoragelog);

    int insertByCriteria(DbStoragelog DbStoragelog);

    int updateByCriteria(DbStoragelog DbStoragelog);

    DbStoragelog selectByPrimaryKey(String sequenceid);

    List<DbStoragelog> selectAll();
}