package com.bean.dao;

import com.bean.model.DbModifylocationTemp;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbModifylocationTempMapper {
    DbModifylocationTemp selectByCriteria(DbModifylocationTemp DbModifylocationTemp);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbModifylocationTemp DbModifylocationTemp);

    int insertByCriteria(DbModifylocationTemp DbModifylocationTemp);

    int updateByCriteria(DbModifylocationTemp DbModifylocationTemp);

    DbModifylocationTemp selectByPrimaryKey(String sequenceid);

    List<DbModifylocationTemp> selectAll();
}