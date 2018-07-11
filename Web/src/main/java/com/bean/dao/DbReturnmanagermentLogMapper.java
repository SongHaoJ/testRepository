package com.bean.dao;

import com.bean.model.DbReturnmanagermentLog;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbReturnmanagermentLogMapper {
    DbReturnmanagermentLog selectByCriteria(DbReturnmanagermentLog DbReturnmanagermentLog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbReturnmanagermentLog DbReturnmanagermentLog);

    int insertByCriteria(DbReturnmanagermentLog DbReturnmanagermentLog);

    int updateByCriteria(DbReturnmanagermentLog DbReturnmanagermentLog);

    DbReturnmanagermentLog selectByPrimaryKey(BigDecimal sequenceid);

    List<DbReturnmanagermentLog> selectAll();
}