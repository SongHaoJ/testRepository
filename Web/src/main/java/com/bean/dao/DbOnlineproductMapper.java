package com.bean.dao;

import com.bean.model.DbOnlineproduct;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbOnlineproductMapper {
    DbOnlineproduct selectByCriteria(DbOnlineproduct DbOnlineproduct);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbOnlineproduct DbOnlineproduct);

    int insertByCriteria(DbOnlineproduct DbOnlineproduct);

    int updateByCriteria(DbOnlineproduct DbOnlineproduct);

    DbOnlineproduct selectByPrimaryKey(String sid);

    List<DbOnlineproduct> selectAll();
}