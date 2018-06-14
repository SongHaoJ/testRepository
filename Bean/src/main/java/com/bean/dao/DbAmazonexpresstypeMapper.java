package com.bean.dao;

import com.bean.model.DbAmazonexpresstype;
import java.math.BigDecimal;

public interface DbAmazonexpresstypeMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbAmazonexpresstype record);

    int insertSelective(DbAmazonexpresstype record);

    DbAmazonexpresstype selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbAmazonexpresstype record);

    int updateByPrimaryKeyWithBLOBs(DbAmazonexpresstype record);

    int updateByPrimaryKey(DbAmazonexpresstype record);
}