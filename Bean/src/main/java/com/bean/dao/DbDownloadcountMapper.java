package com.bean.dao;

import com.bean.model.DbDownloadcount;
import org.springframework.stereotype.Service;

import java.util.List;

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