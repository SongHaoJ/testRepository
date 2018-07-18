package com.bean.dao;

import com.bean.model.DbBindlist;
import com.gourpBean.BindListIncludeProduct;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DbBindlistMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbBindlist record);

    int insertSelective(DbBindlist record);

    DbBindlist selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbBindlist record);

    Integer calcByBindId(String bindid);

    List<BindListIncludeProduct> selectIncludeProduct(String bindid);
}