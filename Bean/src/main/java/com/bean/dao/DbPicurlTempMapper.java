package com.bean.dao;

import com.bean.model.DbPicurlTemp;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbPicurlTempMapper {
    DbPicurlTemp selectByCriteria(DbPicurlTemp DbPicurlTemp);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbPicurlTemp DbPicurlTemp);

    int insertByCriteria(DbPicurlTemp DbPicurlTemp);

    int updateByCriteria(DbPicurlTemp DbPicurlTemp);

    DbPicurlTemp selectByPrimaryKey(BigDecimal sid);

    List<DbPicurlTemp> selectAll();
}