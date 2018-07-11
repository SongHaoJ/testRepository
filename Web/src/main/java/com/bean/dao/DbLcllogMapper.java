package com.bean.dao;

import com.bean.model.DbLcllog;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbLcllogMapper {
    DbLcllog selectByCriteria(DbLcllog DbLcllog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbLcllog DbLcllog);

    int insertByCriteria(DbLcllog DbLcllog);

    int updateByCriteria(DbLcllog DbLcllog);

    DbLcllog selectByPrimaryKey(BigDecimal sequenceid);

    List<DbLcllog> selectAll();
}