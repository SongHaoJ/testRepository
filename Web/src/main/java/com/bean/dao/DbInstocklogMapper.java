package com.bean.dao;

import com.bean.model.DbInstocklog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbInstocklogMapper {
    DbInstocklog selectByCriteria(DbInstocklog DbInstocklog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbInstocklog DbInstocklog);

    int insertByCriteria(DbInstocklog DbInstocklog);

    int updateByCriteria(DbInstocklog DbInstocklog);

    DbInstocklog selectByPrimaryKey(Long sequenceid);

    List<DbInstocklog> selectAll();
}