package com.bean.dao;

import com.bean.model.DbDhexpresstype;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbDhexpresstypeMapper {
    DbDhexpresstype selectByCriteria(DbDhexpresstype DbDhexpresstype);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbDhexpresstype DbDhexpresstype);

    int insertByCriteria(DbDhexpresstype DbDhexpresstype);

    int updateByCriteria(DbDhexpresstype DbDhexpresstype);

    DbDhexpresstype selectByPrimaryKey(String sid);

    List<DbDhexpresstype> selectAll();
}