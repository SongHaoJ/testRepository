package com.bean.dao;

import com.bean.model.DbQtwmsservicetype;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbQtwmsservicetypeMapper {
    DbQtwmsservicetype selectByCriteria(DbQtwmsservicetype DbQtwmsservicetype);

    void deleteByPrimaryKey(String SERVICEID);

    void deleteByCriteria(DbQtwmsservicetype DbQtwmsservicetype);

    int insertByCriteria(DbQtwmsservicetype DbQtwmsservicetype);

    int updateByCriteria(DbQtwmsservicetype DbQtwmsservicetype);

    DbQtwmsservicetype selectByPrimaryKey(String serviceid);

    List<DbQtwmsservicetype> selectAll();
}