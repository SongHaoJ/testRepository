package com.bean.dao;

import com.bean.model.DbProductTitlelog;
import java.util.List;
import org.springframework.stereotype.Service;

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