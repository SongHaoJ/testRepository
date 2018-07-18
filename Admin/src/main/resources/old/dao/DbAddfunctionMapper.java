package com.bean.dao;

import com.bean.model.DbAddfunction;

public interface DbAddfunctionMapper {
    int insert(DbAddfunction record);

    int insertSelective(DbAddfunction record);
}