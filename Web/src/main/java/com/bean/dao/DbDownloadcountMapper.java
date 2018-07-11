package com.bean.dao;

import com.bean.model.DbDownloadcount;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbDownloadcountMapper {
    DbDownloadcount selectByCriteria(DbDownloadcount DbDownloadcount);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbDownloadcount DbDownloadcount);

    int insertByCriteria(DbDownloadcount DbDownloadcount);

    int updateByCriteria(DbDownloadcount DbDownloadcount);

    DbDownloadcount selectByPrimaryKey(String sid);

    List<DbDownloadcount> selectAll();
}