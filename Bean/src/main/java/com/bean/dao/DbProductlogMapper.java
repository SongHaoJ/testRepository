package com.bean.dao;

import com.bean.model.DbProductlog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbProductlogMapper {
    DbProductlog selectByCriteria(DbProductlog DbProductlog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProductlog DbProductlog);

    int insertByCriteria(DbProductlog DbProductlog);

    int updateByCriteria(DbProductlog DbProductlog);

    DbProductlog selectByPrimaryKey(String sequenceid);

    List<DbProductlog> selectAll();
}