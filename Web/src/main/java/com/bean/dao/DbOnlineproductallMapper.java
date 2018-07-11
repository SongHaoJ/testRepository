package com.bean.dao;

import com.bean.model.DbOnlineproductall;
import java.util.List;
import org.springframework.stereotype.Service;

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