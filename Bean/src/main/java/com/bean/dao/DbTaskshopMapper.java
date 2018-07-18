package com.bean.dao;

import com.bean.model.DbTaskshop;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbTaskshopMapper {
    DbTaskshop selectByCriteria(DbTaskshop DbTaskshop);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbTaskshop DbTaskshop);

    int insertByCriteria(DbTaskshop DbTaskshop);

    int updateByCriteria(DbTaskshop DbTaskshop);

    DbTaskshop selectByPrimaryKey(String sid);

    List<DbTaskshop> selectAll();
}