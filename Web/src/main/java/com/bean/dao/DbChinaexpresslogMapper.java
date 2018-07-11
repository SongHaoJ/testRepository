package com.bean.dao;

import com.bean.model.DbChinaexpresslog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbChinaexpresslogMapper {
    DbChinaexpresslog selectByCriteria(DbChinaexpresslog DbChinaexpresslog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbChinaexpresslog DbChinaexpresslog);

    int insertByCriteria(DbChinaexpresslog DbChinaexpresslog);

    int updateByCriteria(DbChinaexpresslog DbChinaexpresslog);

    DbChinaexpresslog selectByPrimaryKey(String sequenceid);

    List<DbChinaexpresslog> selectAll();
}