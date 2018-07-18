package com.bean.dao;

import com.bean.model.DbPerstaprivilege;

public interface DbPerstaprivilegeMapper {
    int insert(DbPerstaprivilege record);

    int insertSelective(DbPerstaprivilege record);
}