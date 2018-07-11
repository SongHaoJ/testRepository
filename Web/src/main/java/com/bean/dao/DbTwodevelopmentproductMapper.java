package com.bean.dao;

import com.bean.model.DbTwodevelopmentproduct;
import java.util.List;
import org.springframework.stereotype.Service;

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