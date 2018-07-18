package com.bean.dao;

import com.bean.model.DbProductforsell;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbProductforsellMapper {
    DbProductforsell selectByCriteria(DbProductforsell DbProductforsell);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProductforsell DbProductforsell);

    int insertByCriteria(DbProductforsell DbProductforsell);

    int updateByCriteria(DbProductforsell DbProductforsell);

    DbProductforsell selectByPrimaryKey(String sequenceid);

    List<DbProductforsell> selectAll();
}