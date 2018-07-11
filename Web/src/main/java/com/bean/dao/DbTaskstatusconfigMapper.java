package com.bean.dao;

import com.bean.model.DbTaskstatusconfig;
import java.util.List;
import org.springframework.stereotype.Service;

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