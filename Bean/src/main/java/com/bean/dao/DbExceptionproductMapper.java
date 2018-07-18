package com.bean.dao;

import com.bean.model.DbExceptionproduct;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbExceptionproductMapper {
    DbExceptionproduct selectByCriteria(DbExceptionproduct DbExceptionproduct);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbExceptionproduct DbExceptionproduct);

    int insertByCriteria(DbExceptionproduct DbExceptionproduct);

    int updateByCriteria(DbExceptionproduct DbExceptionproduct);

    DbExceptionproduct selectByPrimaryKey(String id);

    List<DbExceptionproduct> selectAll();
}