package com.bean.dao;

import com.bean.model.Dept;

public interface DeptMapper {
    int insert(Dept record);

    int insertSelective(Dept record);
}