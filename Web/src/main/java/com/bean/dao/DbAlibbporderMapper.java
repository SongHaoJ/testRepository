package com.bean.dao;

import com.bean.model.DbAlibbporder;
import java.util.List;
import org.springframework.stereotype.Service;

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