package com.bean.dao;

import com.bean.model.DbReason;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbReasonMapper {
    DbReason selectByCriteria(DbReason DbReason);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbReason DbReason);

    int insertByCriteria(DbReason DbReason);

    int updateByCriteria(DbReason DbReason);

    DbReason selectByPrimaryKey(String sequenceid);

    List<DbReason> selectAll();
}