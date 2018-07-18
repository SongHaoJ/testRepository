package com.bean.dao;

import com.bean.model.DbDeveloperaccount;

import java.util.List;

public interface DbDeveloperaccountMapper {
    List<DbDeveloperaccount> selectAll();
}