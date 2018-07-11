package com.bean.dao;

import com.bean.model.DbLazadaexpresstype;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbLazadaexpresstypeMapper {
    DbLazadaexpresstype selectByCriteria(DbLazadaexpresstype DbLazadaexpresstype);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbLazadaexpresstype DbLazadaexpresstype);

    int insertByCriteria(DbLazadaexpresstype DbLazadaexpresstype);

    int updateByCriteria(DbLazadaexpresstype DbLazadaexpresstype);

    DbLazadaexpresstype selectByPrimaryKey(String sid);

    List<DbLazadaexpresstype> selectAll();
}