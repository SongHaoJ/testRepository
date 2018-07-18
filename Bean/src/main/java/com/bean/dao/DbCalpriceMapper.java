package com.bean.dao;

import com.bean.model.DbCalprice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbCalpriceMapper {
    DbCalprice selectByCriteria(DbCalprice DbCalprice);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbCalprice DbCalprice);

    int insertByCriteria(DbCalprice DbCalprice);

    int updateByCriteria(DbCalprice DbCalprice);

    DbCalprice selectByPrimaryKey(String sequenceid);

    List<DbCalprice> selectAll();
}