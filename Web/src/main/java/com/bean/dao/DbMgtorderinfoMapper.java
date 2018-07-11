package com.bean.dao;

import com.bean.model.DbMgtorderinfo;
import java.util.List;
import org.springframework.stereotype.Service;

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