package com.bean.dao;

import com.bean.model.DbShiptaskItem;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbShiptaskItemMapper {
    DbShiptaskItem selectByCriteria(DbShiptaskItem DbShiptaskItem);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbShiptaskItem DbShiptaskItem);

    int insertByCriteria(DbShiptaskItem DbShiptaskItem);

    int updateByCriteria(DbShiptaskItem DbShiptaskItem);

    DbShiptaskItem selectByPrimaryKey(Long id);

    List<DbShiptaskItem> selectAll();
}