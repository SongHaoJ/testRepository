package com.bean.dao;

import com.bean.model.DbMgtorderinfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbMgtorderinfoMapper {
    DbMgtorderinfo selectByCriteria(DbMgtorderinfo DbMgtorderinfo);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbMgtorderinfo DbMgtorderinfo);

    int insertByCriteria(DbMgtorderinfo DbMgtorderinfo);

    int updateByCriteria(DbMgtorderinfo DbMgtorderinfo);

    DbMgtorderinfo selectByPrimaryKey(String sequenceid);

    List<DbMgtorderinfo> selectAll();
}