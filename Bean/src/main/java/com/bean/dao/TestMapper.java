package com.bean.dao;

import com.bean.model.Test;

public interface TestMapper {
    int insert(Test record);

    int insertSelective(Test record);
}