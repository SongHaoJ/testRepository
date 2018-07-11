package com.bean.dao;

import com.bean.model.DbAliexpresstype;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbAliexpresstypeMapper {
    DbAliexpresstype selectByCriteria(DbAliexpresstype DbAliexpresstype);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbAliexpresstype DbAliexpresstype);

    int insertByCriteria(DbAliexpresstype DbAliexpresstype);

    int updateByCriteria(DbAliexpresstype DbAliexpresstype);

    DbAliexpresstype selectByPrimaryKey(BigDecimal sid);

    List<DbAliexpresstype> selectAll();
}