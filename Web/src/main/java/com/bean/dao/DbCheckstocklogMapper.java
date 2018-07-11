package com.bean.dao;

import com.bean.model.DbCheckstocklog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbCheckstocklogMapper {
    DbCheckstocklog selectByCriteria(DbCheckstocklog DbCheckstocklog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbCheckstocklog DbCheckstocklog);

    int insertByCriteria(DbCheckstocklog DbCheckstocklog);

    int updateByCriteria(DbCheckstocklog DbCheckstocklog);

    DbCheckstocklog selectByPrimaryKey(String sequenceid);

    List<DbCheckstocklog> selectAll();
}