package com.bean.dao;

import com.bean.model.DbLazadaorderinfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbLazadaorderinfoMapper {
    DbLazadaorderinfo selectByCriteria(DbLazadaorderinfo DbLazadaorderinfo);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbLazadaorderinfo DbLazadaorderinfo);

    int insertByCriteria(DbLazadaorderinfo DbLazadaorderinfo);

    int updateByCriteria(DbLazadaorderinfo DbLazadaorderinfo);

    DbLazadaorderinfo selectByPrimaryKey(String sequenceid);

    List<DbLazadaorderinfo> selectAll();
}