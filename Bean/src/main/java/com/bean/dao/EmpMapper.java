package com.bean.dao;

import com.bean.model.Emp;

public interface EmpMapper {
    int insert(Emp record);

    int insertSelective(Emp record);
}