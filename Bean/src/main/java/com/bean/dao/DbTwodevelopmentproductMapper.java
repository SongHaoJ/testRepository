package com.bean.dao;

import com.bean.model.DbTwodevelopmentproduct;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbTwodevelopmentproductMapper {
    DbTwodevelopmentproduct selectByCriteria(DbTwodevelopmentproduct DbTwodevelopmentproduct);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbTwodevelopmentproduct DbTwodevelopmentproduct);

    int insertByCriteria(DbTwodevelopmentproduct DbTwodevelopmentproduct);

    int updateByCriteria(DbTwodevelopmentproduct DbTwodevelopmentproduct);

    DbTwodevelopmentproduct selectByPrimaryKey(String sid);

    List<DbTwodevelopmentproduct> selectAll();
}