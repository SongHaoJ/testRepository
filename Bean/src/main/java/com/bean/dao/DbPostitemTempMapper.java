package com.bean.dao;

import com.bean.model.DbPostitemTemp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbPostitemTempMapper {
    DbPostitemTemp selectByCriteria(DbPostitemTemp DbPostitemTemp);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbPostitemTemp DbPostitemTemp);

    int insertByCriteria(DbPostitemTemp DbPostitemTemp);

    int updateByCriteria(DbPostitemTemp DbPostitemTemp);

    DbPostitemTemp selectByPrimaryKey(String sid);

    List<DbPostitemTemp> selectAll();
}