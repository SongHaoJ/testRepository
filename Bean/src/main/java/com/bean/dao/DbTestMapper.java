package com.bean.dao;

import com.bean.model.DbTest;

import java.util.List;

public interface DbTestMapper {
    List<DbTest> selectAll();
}