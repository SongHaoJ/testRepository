package com.bean.dao;

import com.bean.model.DbAlibbporder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbAlibbporderMapper {
    DbAlibbporder selectByCriteria(DbAlibbporder DbAlibbporder);

    void deleteByPrimaryKey(String ORDERID);

    void deleteByCriteria(DbAlibbporder DbAlibbporder);

    int insertByCriteria(DbAlibbporder DbAlibbporder);

    int updateByCriteria(DbAlibbporder DbAlibbporder);

    DbAlibbporder selectByPrimaryKey(String orderid);

    List<DbAlibbporder> selectAll();
}