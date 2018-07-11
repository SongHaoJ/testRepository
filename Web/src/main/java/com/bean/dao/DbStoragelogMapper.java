package com.bean.dao;

import com.bean.model.DbStoragelog;
import java.util.List;
import org.springframework.stereotype.Service;

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