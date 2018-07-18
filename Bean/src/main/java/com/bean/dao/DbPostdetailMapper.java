package com.bean.dao;

import com.bean.model.DbPostdetail;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbPostdetailMapper {
    DbPostdetail selectByCriteria(DbPostdetail DbPostdetail);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbPostdetail DbPostdetail);

    int insertByCriteria(DbPostdetail DbPostdetail);

    int updateByCriteria(DbPostdetail DbPostdetail);

    DbPostdetail selectByPrimaryKey(String sid);

    List<DbPostdetail> selectAll();
}