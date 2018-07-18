package com.bean.dao;

import com.bean.model.DbEubdistrict;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEubdistrictMapper {
    DbEubdistrict selectByCriteria(DbEubdistrict DbEubdistrict);

    void deleteByPrimaryKey(String DITID);

    void deleteByCriteria(DbEubdistrict DbEubdistrict);

    int insertByCriteria(DbEubdistrict DbEubdistrict);

    int updateByCriteria(DbEubdistrict DbEubdistrict);

    DbEubdistrict selectByPrimaryKey(String ditid);

    List<DbEubdistrict> selectAll();
}