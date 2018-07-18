package com.bean.dao;

import com.bean.model.DbItemscontent;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbItemscontentMapper {
    DbItemscontent selectByCriteria(DbItemscontent DbItemscontent);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbItemscontent DbItemscontent);

    int insertByCriteria(DbItemscontent DbItemscontent);

    int updateByCriteria(DbItemscontent DbItemscontent);

    DbItemscontent selectByPrimaryKey(String sid);

    List<DbItemscontent> selectAll();
}