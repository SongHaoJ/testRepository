package com.bean.dao;

import com.bean.model.DbProductlog;
import java.util.List;
import org.springframework.stereotype.Service;

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