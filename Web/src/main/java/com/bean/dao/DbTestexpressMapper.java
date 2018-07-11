package com.bean.dao;

import com.bean.model.DbTestexpress;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbTestexpressMapper {
    DbTestexpress selectByCriteria(DbTestexpress DbTestexpress);

    void deleteByPrimaryKey(String PACKAGE);

    void deleteByCriteria(DbTestexpress DbTestexpress);

    int insertByCriteria(DbTestexpress DbTestexpress);

    int updateByCriteria(DbTestexpress DbTestexpress);

    DbTestexpress selectByPrimaryKey(String package);

    List<DbTestexpress> selectAll();
}