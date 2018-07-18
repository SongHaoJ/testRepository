package com.bean.dao;

import com.bean.model.DbLazadaseller;
import java.util.List;
import org.springframework.stereotype.Service;

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