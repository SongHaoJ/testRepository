package com.bean.dao;

import com.bean.model.DbBirdproduct;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbBirdproductMapper {
    DbBirdproduct selectByCriteria(DbBirdproduct DbBirdproduct);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbBirdproduct DbBirdproduct);

    int insertByCriteria(DbBirdproduct DbBirdproduct);

    int updateByCriteria(DbBirdproduct DbBirdproduct);

    DbBirdproduct selectByPrimaryKey(String sid);

    List<DbBirdproduct> selectAll();
}