package com.bean.dao;

import com.bean.model.DbLablenew;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbLablenewMapper {
    DbLablenew selectByCriteria(DbLablenew DbLablenew);

    void deleteByPrimaryKey(String LABLEID);

    void deleteByCriteria(DbLablenew DbLablenew);

    int insertByCriteria(DbLablenew DbLablenew);

    int updateByCriteria(DbLablenew DbLablenew);

    DbLablenew selectByPrimaryKey(String lableid);

    List<DbLablenew> selectAll();
}