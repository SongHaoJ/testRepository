package com.bean.dao;

import com.bean.model.DbUbiseller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbUbisellerMapper {
    DbUbiseller selectByCriteria(DbUbiseller DbUbiseller);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbUbiseller DbUbiseller);

    int insertByCriteria(DbUbiseller DbUbiseller);

    int updateByCriteria(DbUbiseller DbUbiseller);

    DbUbiseller selectByPrimaryKey(String sid);

    List<DbUbiseller> selectAll();
}