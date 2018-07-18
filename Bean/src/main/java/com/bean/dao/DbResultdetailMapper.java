package com.bean.dao;

import com.bean.model.DbResultdetail;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbResultdetailMapper {
    DbResultdetail selectByCriteria(DbResultdetail DbResultdetail);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbResultdetail DbResultdetail);

    int insertByCriteria(DbResultdetail DbResultdetail);

    int updateByCriteria(DbResultdetail DbResultdetail);

    DbResultdetail selectByPrimaryKey(String sid);

    List<DbResultdetail> selectAll();
}