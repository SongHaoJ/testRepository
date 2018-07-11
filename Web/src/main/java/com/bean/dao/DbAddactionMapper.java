package com.bean.dao;

import com.bean.model.DbAddaction;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbAddactionMapper {
    DbAddaction selectByCriteria(DbAddaction DbAddaction);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbAddaction DbAddaction);

    int insertByCriteria(DbAddaction DbAddaction);

    int updateByCriteria(DbAddaction DbAddaction);

    DbAddaction selectByPrimaryKey(String sequenceid);

    List<DbAddaction> selectAll();
}