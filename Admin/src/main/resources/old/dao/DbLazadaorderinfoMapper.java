package com.bean.dao;

import com.bean.model.DbLazadaorderinfo;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DbLazadaorderinfoMapper {
    int deleteByPrimaryKey(String sequenceid)throws Exception;

    int insert(DbLazadaorderinfo record)throws Exception;

    int insertSelective(DbLazadaorderinfo record)throws Exception;

    DbLazadaorderinfo selectByPrimaryKey(String sequenceid)throws Exception;

    int updateByPrimaryKeySelective(DbLazadaorderinfo record)throws Exception;

    List<DbLazadaorderinfo> selectByCriteria(DbLazadaorderinfo orderInfo)throws Exception;
}