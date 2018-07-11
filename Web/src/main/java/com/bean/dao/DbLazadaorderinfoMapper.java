package com.bean.dao;

import com.bean.model.DbLazadaorderinfo;
import java.util.List;
import org.springframework.stereotype.Service;

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