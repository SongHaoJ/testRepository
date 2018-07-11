package com.bean.dao;

import com.bean.model.DbBpostexpresstype;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbBpostexpresstypeMapper {
    DbBpostexpresstype selectByCriteria(DbBpostexpresstype DbBpostexpresstype);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbBpostexpresstype DbBpostexpresstype);

    int insertByCriteria(DbBpostexpresstype DbBpostexpresstype);

    int updateByCriteria(DbBpostexpresstype DbBpostexpresstype);

    DbBpostexpresstype selectByPrimaryKey(String sid);

    List<DbBpostexpresstype> selectAll();
}