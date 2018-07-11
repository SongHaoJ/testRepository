package com.bean.dao;

import com.bean.model.DbTasklog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbTasklogMapper {
    DbTasklog selectByCriteria(DbTasklog DbTasklog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbTasklog DbTasklog);

    int insertByCriteria(DbTasklog DbTasklog);

    int updateByCriteria(DbTasklog DbTasklog);

    DbTasklog selectByPrimaryKey(String sequenceid);

    List<DbTasklog> selectAll();
}