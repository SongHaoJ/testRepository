package com.bean.dao;

import com.bean.model.DbOpermenu;
import org.apache.ibatis.annotations.Param;

public interface DbOpermenuMapper {
    int deleteByPrimaryKey(@Param("oper") String oper, @Param("menuid") String menuid);

    int insert(DbOpermenu record);

    int insertSelective(DbOpermenu record);
}