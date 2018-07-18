package com.bean.dao;

import com.bean.model.DbTaskstatusconfig;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbTaskstatusconfigMapper {
    DbTaskstatusconfig selectByCriteria(DbTaskstatusconfig DbTaskstatusconfig);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbTaskstatusconfig DbTaskstatusconfig);

    int insertByCriteria(DbTaskstatusconfig DbTaskstatusconfig);

    int updateByCriteria(DbTaskstatusconfig DbTaskstatusconfig);

    DbTaskstatusconfig selectByPrimaryKey(String sequenceid);

    List<DbTaskstatusconfig> selectAll();
}