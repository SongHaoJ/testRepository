package com.bean.dao;

import com.bean.model.DbImgconfig;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbImgconfigMapper {
    DbImgconfig selectByCriteria(DbImgconfig DbImgconfig);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbImgconfig DbImgconfig);

    int insertByCriteria(DbImgconfig DbImgconfig);

    int updateByCriteria(DbImgconfig DbImgconfig);

    DbImgconfig selectByPrimaryKey(String sequenceid);

    List<DbImgconfig> selectAll();
}