package com.bean.dao;

import com.bean.model.DbOnlineproductall;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbOnlineproductallMapper {
    DbOnlineproductall selectByCriteria(DbOnlineproductall DbOnlineproductall);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbOnlineproductall DbOnlineproductall);

    int insertByCriteria(DbOnlineproductall DbOnlineproductall);

    int updateByCriteria(DbOnlineproductall DbOnlineproductall);

    DbOnlineproductall selectByPrimaryKey(String sid);

    List<DbOnlineproductall> selectAll();
}