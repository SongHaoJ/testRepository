package com.bean.dao;

import com.bean.model.DbLocation;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbLocationMapper {
    DbLocation selectByCriteria(DbLocation DbLocation);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbLocation DbLocation);

    int insertByCriteria(DbLocation DbLocation);

    int updateByCriteria(DbLocation DbLocation);

    DbLocation selectByPrimaryKey(String sequenceid);

    List<DbLocation> selectAll();
}