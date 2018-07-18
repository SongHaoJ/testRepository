package com.bean.dao;

import com.bean.model.DbChinaexpressarea;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbChinaexpressareaMapper {
    DbChinaexpressarea selectByCriteria(DbChinaexpressarea DbChinaexpressarea);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbChinaexpressarea DbChinaexpressarea);

    int insertByCriteria(DbChinaexpressarea DbChinaexpressarea);

    int updateByCriteria(DbChinaexpressarea DbChinaexpressarea);

    DbChinaexpressarea selectByPrimaryKey(String sequenceid);

    List<DbChinaexpressarea> selectAll();
}