package com.bean.dao;

import com.bean.model.DbOpergroup;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbOpergroupMapper {
    DbOpergroup selectByCriteria(DbOpergroup DbOpergroup);

    void deleteByPrimaryKey(String OPER);

    void deleteByCriteria(DbOpergroup DbOpergroup);

    int insertByCriteria(DbOpergroup DbOpergroup);

    int updateByCriteria(DbOpergroup DbOpergroup);

    DbOpergroup selectByPrimaryKey(String oper);

    List<DbOpergroup> selectAll();
}