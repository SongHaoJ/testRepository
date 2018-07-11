package com.bean.dao;

import com.bean.model.DbTaskcategory;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbTaskcategoryMapper {
    DbTaskcategory selectByCriteria(DbTaskcategory DbTaskcategory);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbTaskcategory DbTaskcategory);

    int insertByCriteria(DbTaskcategory DbTaskcategory);

    int updateByCriteria(DbTaskcategory DbTaskcategory);

    DbTaskcategory selectByPrimaryKey(String sid);

    List<DbTaskcategory> selectAll();
}