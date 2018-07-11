package com.bean.dao;

import com.bean.model.DbProductanditemid;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbProductanditemidMapper {
    DbProductanditemid selectByCriteria(DbProductanditemid DbProductanditemid);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProductanditemid DbProductanditemid);

    int insertByCriteria(DbProductanditemid DbProductanditemid);

    int updateByCriteria(DbProductanditemid DbProductanditemid);

    DbProductanditemid selectByPrimaryKey(String sequenceid);

    List<DbProductanditemid> selectAll();
}