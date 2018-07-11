package com.bean.dao;

import com.bean.model.DbPaypalTemp;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbPaypalTempMapper {
    DbPaypalTemp selectByCriteria(DbPaypalTemp DbPaypalTemp);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbPaypalTemp DbPaypalTemp);

    int insertByCriteria(DbPaypalTemp DbPaypalTemp);

    int updateByCriteria(DbPaypalTemp DbPaypalTemp);

    DbPaypalTemp selectByPrimaryKey(String sequenceid);

    List<DbPaypalTemp> selectAll();
}