package com.bean.dao;

import com.bean.model.DbImgconfiglog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbImgconfiglogMapper {
    DbImgconfiglog selectByCriteria(DbImgconfiglog DbImgconfiglog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbImgconfiglog DbImgconfiglog);

    int insertByCriteria(DbImgconfiglog DbImgconfiglog);

    int updateByCriteria(DbImgconfiglog DbImgconfiglog);

    DbImgconfiglog selectByPrimaryKey(String sequenceid);

    List<DbImgconfiglog> selectAll();
}