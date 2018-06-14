package com.bean.dao;

import com.bean.model.DbPicurlTemp;
import java.math.BigDecimal;

public interface DbPicurlTempMapper {
    int deleteByPrimaryKey(BigDecimal sid);

    int insert(DbPicurlTemp record);

    int insertSelective(DbPicurlTemp record);

    DbPicurlTemp selectByPrimaryKey(BigDecimal sid);

    int updateByPrimaryKeySelective(DbPicurlTemp record);

    int updateByPrimaryKeyWithBLOBs(DbPicurlTemp record);

    int updateByPrimaryKey(DbPicurlTemp record);
}