package com.bean.dao;

import com.bean.model.DbCaiwulog;
import java.util.List;
import org.springframework.stereotype.Service;

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