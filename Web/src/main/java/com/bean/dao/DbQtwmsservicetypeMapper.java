package com.bean.dao;

import com.bean.model.DbQtwmsservicetype;
import java.util.List;
import org.springframework.stereotype.Service;

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