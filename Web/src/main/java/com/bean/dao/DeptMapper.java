package com.bean.dao;

import com.bean.model.Dept;
import java.util.List;

public interface DeptMapper {
    List<Dept> selectAll();
}