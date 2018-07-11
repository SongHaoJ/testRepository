package com.bean.dao;

import com.bean.model.DbAnalysetype;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbAnalysetypeMapper {
    DbAnalysetype selectByCriteria(DbAnalysetype DbAnalysetype);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbAnalysetype DbAnalysetype);

    int insertByCriteria(DbAnalysetype DbAnalysetype);

    int updateByCriteria(DbAnalysetype DbAnalysetype);

    DbAnalysetype selectByPrimaryKey(String sequenceid);

    List<DbAnalysetype> selectAll();
}