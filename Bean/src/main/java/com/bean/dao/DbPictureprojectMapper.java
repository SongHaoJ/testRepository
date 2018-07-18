package com.bean.dao;

import com.bean.model.DbPictureproject;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbPictureprojectMapper {
    DbPictureproject selectByCriteria(DbPictureproject DbPictureproject);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbPictureproject DbPictureproject);

    int insertByCriteria(DbPictureproject DbPictureproject);

    int updateByCriteria(DbPictureproject DbPictureproject);

    DbPictureproject selectByPrimaryKey(String sequenceid);

    List<DbPictureproject> selectAll();
}