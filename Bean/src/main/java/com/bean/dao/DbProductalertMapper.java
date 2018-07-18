package com.bean.dao;

import com.bean.model.DbProductalert;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbProductalertMapper {
    DbProductalert selectByCriteria(DbProductalert DbProductalert);

    void deleteByPrimaryKey(String SQUENCEID);

    void deleteByCriteria(DbProductalert DbProductalert);

    int insertByCriteria(DbProductalert DbProductalert);

    int updateByCriteria(DbProductalert DbProductalert);

    DbProductalert selectByPrimaryKey(String squenceid);

    List<DbProductalert> selectAll();
}