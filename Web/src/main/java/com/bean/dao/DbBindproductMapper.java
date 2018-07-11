package com.bean.dao;

import com.bean.model.DbBindproduct;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbBindproductMapper {
    DbBindproduct selectByCriteria(DbBindproduct DbBindproduct);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbBindproduct DbBindproduct);

    int insertByCriteria(DbBindproduct DbBindproduct);

    int updateByCriteria(DbBindproduct DbBindproduct);

    DbBindproduct selectByPrimaryKey(String sid);

    List<DbBindproduct> selectAll();
}