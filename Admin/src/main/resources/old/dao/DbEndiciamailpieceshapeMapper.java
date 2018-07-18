package com.bean.dao;

import com.bean.model.DbEndiciamailpieceshape;

public interface DbEndiciamailpieceshapeMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbEndiciamailpieceshape record);

    int insertSelective(DbEndiciamailpieceshape record);

    DbEndiciamailpieceshape selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbEndiciamailpieceshape record);

    int updateByPrimaryKey(DbEndiciamailpieceshape record);
}