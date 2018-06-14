package com.bean.dao;

import com.bean.model.DbDefaultMenufunc;
import org.apache.ibatis.annotations.Param;

public interface DbDefaultMenufuncMapper {
    int deleteByPrimaryKey(@Param("classid") String classid, @Param("funid") String funid);

    int insert(DbDefaultMenufunc record);

    int insertSelective(DbDefaultMenufunc record);
}