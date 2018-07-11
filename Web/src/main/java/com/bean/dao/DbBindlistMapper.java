package com.bean.dao;

import com.bean.model.DbBindlist;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbBindlistMapper {
    DbBindlist selectByCriteria(DbBindlist DbBindlist);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbBindlist DbBindlist);

    int insertByCriteria(DbBindlist DbBindlist);

    int updateByCriteria(DbBindlist DbBindlist);

    DbBindlist selectByPrimaryKey(String sid);

    List<DbBindlist> selectAll();
}