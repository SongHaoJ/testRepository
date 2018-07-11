package com.bean.dao;

import com.bean.model.DbCneexpresstype;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbCneexpresstypeMapper {
    DbCneexpresstype selectByCriteria(DbCneexpresstype DbCneexpresstype);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbCneexpresstype DbCneexpresstype);

    int insertByCriteria(DbCneexpresstype DbCneexpresstype);

    int updateByCriteria(DbCneexpresstype DbCneexpresstype);

    DbCneexpresstype selectByPrimaryKey(BigDecimal sequenceid);

    List<DbCneexpresstype> selectAll();
}