package com.bean.dao;

import com.bean.model.Emp;

import java.util.List;

public interface EmpMapper {
    List<Emp> selectAll();
}