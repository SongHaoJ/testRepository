package com.bean.dao;

import com.bean.model.DbCkytype;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbCkytypeMapper {
    DbCkytype selectByCriteria(DbCkytype DbCkytype);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbCkytype DbCkytype);

    int insertByCriteria(DbCkytype DbCkytype);

    int updateByCriteria(DbCkytype DbCkytype);

    DbCkytype selectByPrimaryKey(String sid);

    List<DbCkytype> selectAll();
}