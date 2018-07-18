package com.bean.dao;

import com.bean.model.DbProductbackinfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbProductbackinfoMapper {
    DbProductbackinfo selectByCriteria(DbProductbackinfo DbProductbackinfo);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProductbackinfo DbProductbackinfo);

    int insertByCriteria(DbProductbackinfo DbProductbackinfo);

    int updateByCriteria(DbProductbackinfo DbProductbackinfo);

    DbProductbackinfo selectByPrimaryKey(String sequenceid);

    List<DbProductbackinfo> selectAll();
}