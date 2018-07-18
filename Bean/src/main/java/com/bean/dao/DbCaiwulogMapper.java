package com.bean.dao;

import com.bean.model.DbCaiwulog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbCaiwulogMapper {
    DbCaiwulog selectByCriteria(DbCaiwulog DbCaiwulog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbCaiwulog DbCaiwulog);

    int insertByCriteria(DbCaiwulog DbCaiwulog);

    int updateByCriteria(DbCaiwulog DbCaiwulog);

    DbCaiwulog selectByPrimaryKey(String sequenceid);

    List<DbCaiwulog> selectAll();
}