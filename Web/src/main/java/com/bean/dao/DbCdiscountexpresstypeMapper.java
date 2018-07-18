package com.bean.dao;

import com.bean.model.DbCdiscountexpresstype;
import java.util.List;
import org.springframework.stereotype.Service;

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