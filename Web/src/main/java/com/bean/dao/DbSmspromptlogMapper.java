package com.bean.dao;

import com.bean.model.DbSmspromptlog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbSmspromptlogMapper {
    DbSmspromptlog selectByCriteria(DbSmspromptlog DbSmspromptlog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbSmspromptlog DbSmspromptlog);

    int insertByCriteria(DbSmspromptlog DbSmspromptlog);

    int updateByCriteria(DbSmspromptlog DbSmspromptlog);

    DbSmspromptlog selectByPrimaryKey(String sequenceid);

    List<DbSmspromptlog> selectAll();
}