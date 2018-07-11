package com.bean.dao;

import com.bean.model.DbWytproduct;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbWytproductMapper {
    DbWytproduct selectByCriteria(DbWytproduct DbWytproduct);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbWytproduct DbWytproduct);

    int insertByCriteria(DbWytproduct DbWytproduct);

    int updateByCriteria(DbWytproduct DbWytproduct);

    DbWytproduct selectByPrimaryKey(String sid);

    List<DbWytproduct> selectAll();
}