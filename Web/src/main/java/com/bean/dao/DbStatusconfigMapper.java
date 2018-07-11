package com.bean.dao;

import com.bean.model.DbStatusconfig;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbStatusconfigMapper {
    DbStatusconfig selectByCriteria(DbStatusconfig DbStatusconfig);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbStatusconfig DbStatusconfig);

    int insertByCriteria(DbStatusconfig DbStatusconfig);

    int updateByCriteria(DbStatusconfig DbStatusconfig);

    DbStatusconfig selectByPrimaryKey(BigDecimal sid);

    List<DbStatusconfig> selectAll();
}