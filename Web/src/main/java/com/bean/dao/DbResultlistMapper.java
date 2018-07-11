package com.bean.dao;

import com.bean.model.DbResultlist;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbResultlistMapper {
    DbResultlist selectByCriteria(DbResultlist DbResultlist);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbResultlist DbResultlist);

    int insertByCriteria(DbResultlist DbResultlist);

    int updateByCriteria(DbResultlist DbResultlist);

    DbResultlist selectByPrimaryKey(String sid);

    List<DbResultlist> selectAll();
}