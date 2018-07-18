package com.bean.dao;

import com.bean.model.DbShiptaskItemHistory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbShiptaskItemHistoryMapper {
    DbShiptaskItemHistory selectByCriteria(DbShiptaskItemHistory DbShiptaskItemHistory);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbShiptaskItemHistory DbShiptaskItemHistory);

    int insertByCriteria(DbShiptaskItemHistory DbShiptaskItemHistory);

    int updateByCriteria(DbShiptaskItemHistory DbShiptaskItemHistory);

    DbShiptaskItemHistory selectByPrimaryKey(Long id);

    List<DbShiptaskItemHistory> selectAll();
}