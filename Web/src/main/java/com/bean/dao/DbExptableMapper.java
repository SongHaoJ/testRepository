package com.bean.dao;

import com.bean.model.DbExptable;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbExptableMapper {
    DbExptable selectByCriteria(DbExptable DbExptable);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbExptable DbExptable);

    int insertByCriteria(DbExptable DbExptable);

    int updateByCriteria(DbExptable DbExptable);

    DbExptable selectByPrimaryKey(String sid);

    List<DbExptable> selectAll();
}