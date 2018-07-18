package com.bean.dao;

import com.bean.model.DbChinaexpress;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbChinaexpressMapper {
    DbChinaexpress selectByCriteria(DbChinaexpress DbChinaexpress);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbChinaexpress DbChinaexpress);

    int insertByCriteria(DbChinaexpress DbChinaexpress);

    int updateByCriteria(DbChinaexpress DbChinaexpress);

    DbChinaexpress selectByPrimaryKey(String sequenceid);

    List<DbChinaexpress> selectAll();
}