package com.bean.dao;

import com.bean.model.DbProducttypeset;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbProducttypesetMapper {
    DbProducttypeset selectByCriteria(DbProducttypeset DbProducttypeset);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProducttypeset DbProducttypeset);

    int insertByCriteria(DbProducttypeset DbProducttypeset);

    int updateByCriteria(DbProducttypeset DbProducttypeset);

    DbProducttypeset selectByPrimaryKey(String sequenceid);

    List<DbProducttypeset> selectAll();
}