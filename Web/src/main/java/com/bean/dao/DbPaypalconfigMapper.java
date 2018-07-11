package com.bean.dao;

import com.bean.model.DbPaypalconfig;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbPaypalconfigMapper {
    DbPaypalconfig selectByCriteria(DbPaypalconfig DbPaypalconfig);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbPaypalconfig DbPaypalconfig);

    int insertByCriteria(DbPaypalconfig DbPaypalconfig);

    int updateByCriteria(DbPaypalconfig DbPaypalconfig);

    DbPaypalconfig selectByPrimaryKey(String sequenceid);

    List<DbPaypalconfig> selectAll();
}