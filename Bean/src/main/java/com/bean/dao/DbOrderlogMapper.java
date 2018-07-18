package com.bean.dao;

import com.bean.model.DbOrderlog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbOrderlogMapper {
    DbOrderlog selectByCriteria(DbOrderlog DbOrderlog);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbOrderlog DbOrderlog);

    int insertByCriteria(DbOrderlog DbOrderlog);

    int updateByCriteria(DbOrderlog DbOrderlog);

    DbOrderlog selectByPrimaryKey(String sid);

    List<DbOrderlog> selectAll();
}