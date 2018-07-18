package com.bean.dao;

import com.bean.model.DbAsktradernumber;
import org.springframework.stereotype.Service;

@Service
public interface DbAsktradernumberMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbAsktradernumber record);

    int insertSelective(DbAsktradernumber record);

    DbAsktradernumber selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbAsktradernumber record);

}