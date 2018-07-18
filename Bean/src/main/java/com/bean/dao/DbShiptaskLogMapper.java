package com.bean.dao;

import com.bean.model.DbShiptaskLog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbShiptaskLogMapper {
    DbShiptaskLog selectByCriteria(DbShiptaskLog DbShiptaskLog);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbShiptaskLog DbShiptaskLog);

    int insertByCriteria(DbShiptaskLog DbShiptaskLog);

    int updateByCriteria(DbShiptaskLog DbShiptaskLog);

    DbShiptaskLog selectByPrimaryKey(Long id);

    List<DbShiptaskLog> selectAll();
}