package com.bean.dao;

import com.bean.model.DbShiptaskHistory;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbShiptaskHistoryMapper {
    DbShiptaskHistory selectByCriteria(DbShiptaskHistory DbShiptaskHistory);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbShiptaskHistory DbShiptaskHistory);

    int insertByCriteria(DbShiptaskHistory DbShiptaskHistory);

    int updateByCriteria(DbShiptaskHistory DbShiptaskHistory);

    DbShiptaskHistory selectByPrimaryKey(Long id);

    List<DbShiptaskHistory> selectAll();
}