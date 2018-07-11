package com.bean.dao;

import com.bean.model.DbCkyorder;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbCkyorderMapper {
    DbCkyorder selectByCriteria(DbCkyorder DbCkyorder);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbCkyorder DbCkyorder);

    int insertByCriteria(DbCkyorder DbCkyorder);

    int updateByCriteria(DbCkyorder DbCkyorder);

    DbCkyorder selectByPrimaryKey(String sid);

    List<DbCkyorder> selectAll();
}