package com.bean.dao;

import com.bean.model.DbCkyexpresstype;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbCkyexpresstypeMapper {
    DbCkyexpresstype selectByCriteria(DbCkyexpresstype DbCkyexpresstype);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbCkyexpresstype DbCkyexpresstype);

    int insertByCriteria(DbCkyexpresstype DbCkyexpresstype);

    int updateByCriteria(DbCkyexpresstype DbCkyexpresstype);

    DbCkyexpresstype selectByPrimaryKey(String sid);

    List<DbCkyexpresstype> selectAll();
}