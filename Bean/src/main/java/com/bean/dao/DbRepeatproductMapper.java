package com.bean.dao;

import com.bean.model.DbRepeatproduct;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbRepeatproductMapper {
    DbRepeatproduct selectByCriteria(DbRepeatproduct DbRepeatproduct);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbRepeatproduct DbRepeatproduct);

    int insertByCriteria(DbRepeatproduct DbRepeatproduct);

    int updateByCriteria(DbRepeatproduct DbRepeatproduct);

    DbRepeatproduct selectByPrimaryKey(BigDecimal sequenceid);

    List<DbRepeatproduct> selectAll();
}