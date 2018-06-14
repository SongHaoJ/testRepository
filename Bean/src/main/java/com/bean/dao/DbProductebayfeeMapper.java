package com.bean.dao;

import com.bean.model.DbProductebayfee;
import java.math.BigDecimal;

public interface DbProductebayfeeMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbProductebayfee record);

    int insertSelective(DbProductebayfee record);

    DbProductebayfee selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbProductebayfee record);

    int updateByPrimaryKey(DbProductebayfee record);
}