package com.bean.dao;

import com.bean.model.DbReturnmanagerment;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbReturnmanagermentMapper {
    DbReturnmanagerment selectByCriteria(DbReturnmanagerment DbReturnmanagerment);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbReturnmanagerment DbReturnmanagerment);

    int insertByCriteria(DbReturnmanagerment DbReturnmanagerment);

    int updateByCriteria(DbReturnmanagerment DbReturnmanagerment);

    DbReturnmanagerment selectByPrimaryKey(BigDecimal sequenceid);

    List<DbReturnmanagerment> selectAll();
}