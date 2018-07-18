package com.bean.dao;

import com.bean.model.DbEbayidmanagehtmlsource;
import java.math.BigDecimal;

public interface DbEbayidmanagehtmlsourceMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbEbayidmanagehtmlsource record);

    int insertSelective(DbEbayidmanagehtmlsource record);

    DbEbayidmanagehtmlsource selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbEbayidmanagehtmlsource record);

    int updateByPrimaryKeyWithBLOBs(DbEbayidmanagehtmlsource record);

    int updateByPrimaryKey(DbEbayidmanagehtmlsource record);
}