package com.bean.dao;

import com.bean.model.DbCneseller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbCnesellerMapper {
    DbCneseller selectByCriteria(DbCneseller DbCneseller);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbCneseller DbCneseller);

    int insertByCriteria(DbCneseller DbCneseller);

    int updateByCriteria(DbCneseller DbCneseller);

    DbCneseller selectByPrimaryKey(String sid);

    List<DbCneseller> selectAll();
}