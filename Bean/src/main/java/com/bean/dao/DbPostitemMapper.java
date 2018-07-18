package com.bean.dao;

import com.bean.model.DbPostitem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbPostitemMapper {
    DbPostitem selectByCriteria(DbPostitem DbPostitem);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbPostitem DbPostitem);

    int insertByCriteria(DbPostitem DbPostitem);

    int updateByCriteria(DbPostitem DbPostitem);

    DbPostitem selectByPrimaryKey(String sid);

    List<DbPostitem> selectAll();
}