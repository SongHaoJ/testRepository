package com.bean.dao;

import com.bean.model.DbProjectproduct;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbProjectproductMapper {
    DbProjectproduct selectByCriteria(DbProjectproduct DbProjectproduct);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbProjectproduct DbProjectproduct);

    int insertByCriteria(DbProjectproduct DbProjectproduct);

    int updateByCriteria(DbProjectproduct DbProjectproduct);

    DbProjectproduct selectByPrimaryKey(String sid);

    List<DbProjectproduct> selectAll();
}