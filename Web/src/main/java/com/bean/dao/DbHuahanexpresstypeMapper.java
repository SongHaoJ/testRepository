package com.bean.dao;

import com.bean.model.DbHuahanexpresstype;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbHuahanexpresstypeMapper {
    DbHuahanexpresstype selectByCriteria(DbHuahanexpresstype DbHuahanexpresstype);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbHuahanexpresstype DbHuahanexpresstype);

    int insertByCriteria(DbHuahanexpresstype DbHuahanexpresstype);

    int updateByCriteria(DbHuahanexpresstype DbHuahanexpresstype);

    DbHuahanexpresstype selectByPrimaryKey(BigDecimal sequenceid);

    List<DbHuahanexpresstype> selectAll();
}