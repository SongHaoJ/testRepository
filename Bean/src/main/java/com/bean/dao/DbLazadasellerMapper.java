package com.bean.dao;

import com.bean.model.DbLazadaseller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbLazadasellerMapper {
    DbLazadaseller selectByCriteria(DbLazadaseller DbLazadaseller);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbLazadaseller DbLazadaseller);

    int insertByCriteria(DbLazadaseller DbLazadaseller);

    int updateByCriteria(DbLazadaseller DbLazadaseller);

    DbLazadaseller selectByPrimaryKey(String sid);

    List<DbLazadaseller> selectAll();
}