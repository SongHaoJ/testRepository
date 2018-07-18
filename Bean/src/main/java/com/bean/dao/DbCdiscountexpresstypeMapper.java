package com.bean.dao;

import com.bean.model.DbCdiscountexpresstype;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbCdiscountexpresstypeMapper {
    DbCdiscountexpresstype selectByCriteria(DbCdiscountexpresstype DbCdiscountexpresstype);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbCdiscountexpresstype DbCdiscountexpresstype);

    int insertByCriteria(DbCdiscountexpresstype DbCdiscountexpresstype);

    int updateByCriteria(DbCdiscountexpresstype DbCdiscountexpresstype);

    DbCdiscountexpresstype selectByPrimaryKey(String sid);

    List<DbCdiscountexpresstype> selectAll();
}