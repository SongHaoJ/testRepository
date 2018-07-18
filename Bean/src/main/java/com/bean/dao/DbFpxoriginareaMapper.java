package com.bean.dao;

import com.bean.model.DbFpxoriginarea;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbFpxoriginareaMapper {
    DbFpxoriginarea selectByCriteria(DbFpxoriginarea DbFpxoriginarea);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbFpxoriginarea DbFpxoriginarea);

    int insertByCriteria(DbFpxoriginarea DbFpxoriginarea);

    int updateByCriteria(DbFpxoriginarea DbFpxoriginarea);

    DbFpxoriginarea selectByPrimaryKey(String sid);

    List<DbFpxoriginarea> selectAll();
}