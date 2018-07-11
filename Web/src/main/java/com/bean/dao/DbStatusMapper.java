package com.bean.dao;

import com.bean.model.DbStatus;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbStatusMapper {
    DbStatus selectByCriteria(DbStatus DbStatus);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbStatus DbStatus);

    int insertByCriteria(DbStatus DbStatus);

    int updateByCriteria(DbStatus DbStatus);

    DbStatus selectByPrimaryKey(BigDecimal sid);

    List<DbStatus> selectAll();
}