package com.bean.dao;

import com.bean.model.DbUploadfile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbUploadfileMapper {
    DbUploadfile selectByCriteria(DbUploadfile DbUploadfile);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbUploadfile DbUploadfile);

    int insertByCriteria(DbUploadfile DbUploadfile);

    int updateByCriteria(DbUploadfile DbUploadfile);

    DbUploadfile selectByPrimaryKey(String sequenceid);

    List<DbUploadfile> selectAll();
}