package com.bean.dao;

import com.bean.model.DbAywarehouse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbAywarehouseMapper {
    DbAywarehouse selectByCriteria(DbAywarehouse DbAywarehouse);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbAywarehouse DbAywarehouse);

    int insertByCriteria(DbAywarehouse DbAywarehouse);

    int updateByCriteria(DbAywarehouse DbAywarehouse);

    DbAywarehouse selectByPrimaryKey(Long id);

    List<DbAywarehouse> selectAll();
}