package com.bean.dao;

import com.bean.model.DbWytcategorydetail;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbWytcategorydetailMapper {
    DbWytcategorydetail selectByCriteria(DbWytcategorydetail DbWytcategorydetail);

    void deleteByPrimaryKey(String MWAREHOUSEID);

    void deleteByCriteria(DbWytcategorydetail DbWytcategorydetail);

    int insertByCriteria(DbWytcategorydetail DbWytcategorydetail);

    int updateByCriteria(DbWytcategorydetail DbWytcategorydetail);

    DbWytcategorydetail selectByPrimaryKey(String mwarehouseid);

    List<DbWytcategorydetail> selectAll();
}