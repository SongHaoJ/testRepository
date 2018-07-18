package com.bean.dao;

import com.bean.model.DbTophatterexpresstype;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbTophatterexpresstypeMapper {
    DbTophatterexpresstype selectByCriteria(DbTophatterexpresstype DbTophatterexpresstype);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbTophatterexpresstype DbTophatterexpresstype);

    int insertByCriteria(DbTophatterexpresstype DbTophatterexpresstype);

    int updateByCriteria(DbTophatterexpresstype DbTophatterexpresstype);

    DbTophatterexpresstype selectByPrimaryKey(String sid);

    List<DbTophatterexpresstype> selectAll();
}