package com.bean.dao;

import com.bean.model.DbEncode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEncodeMapper {
    DbEncode selectByCriteria(DbEncode DbEncode);

    void deleteByPrimaryKey(String CHAR1);

    void deleteByCriteria(DbEncode DbEncode);

    int insertByCriteria(DbEncode DbEncode);

    int updateByCriteria(DbEncode DbEncode);

    DbEncode selectByPrimaryKey(String char1);

    List<DbEncode> selectAll();
}