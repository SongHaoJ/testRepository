package com.bean.dao;

import com.bean.model.Tt;
import java.math.BigDecimal;

public interface TtMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(Tt record);

    int insertSelective(Tt record);

    Tt selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(Tt record);

    int updateByPrimaryKey(Tt record);
}