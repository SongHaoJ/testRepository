package com.bean.dao;

import com.bean.model.Test;
import java.util.List;

public interface TestMapper {
    List<Test> selectAll();
}