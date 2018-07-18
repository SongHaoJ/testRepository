package com.bean.dao;

import com.bean.model.DbFbasell;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbFbasellMapper {
    DbFbasell selectByCriteria(DbFbasell DbFbasell);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbFbasell DbFbasell);

    int insertByCriteria(DbFbasell DbFbasell);

    int updateByCriteria(DbFbasell DbFbasell);

    DbFbasell selectByPrimaryKey(String sid);

    List<DbFbasell> selectAll();
}