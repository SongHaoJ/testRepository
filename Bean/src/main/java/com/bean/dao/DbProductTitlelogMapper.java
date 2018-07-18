package com.bean.dao;

import com.bean.model.DbProductTitlelog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbProductTitlelogMapper {
    DbProductTitlelog selectByCriteria(DbProductTitlelog DbProductTitlelog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProductTitlelog DbProductTitlelog);

    int insertByCriteria(DbProductTitlelog DbProductTitlelog);

    int updateByCriteria(DbProductTitlelog DbProductTitlelog);

    DbProductTitlelog selectByPrimaryKey(String sequenceid);

    List<DbProductTitlelog> selectAll();
}