package com.bean.dao;

import com.bean.model.DbPicurlTemp;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

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