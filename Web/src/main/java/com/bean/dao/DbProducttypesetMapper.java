package com.bean.dao;

import com.bean.model.DbProducttypeset;
import java.util.List;
import org.springframework.stereotype.Service;

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