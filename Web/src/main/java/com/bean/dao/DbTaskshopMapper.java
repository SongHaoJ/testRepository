package com.bean.dao;

import com.bean.model.DbTaskshop;
import java.util.List;
import org.springframework.stereotype.Service;

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