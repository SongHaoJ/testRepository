package com.bean.dao;

import com.bean.model.DbShopmessagereportforms;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbShopmessagereportformsMapper {
    DbShopmessagereportforms selectByCriteria(DbShopmessagereportforms DbShopmessagereportforms);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbShopmessagereportforms DbShopmessagereportforms);

    int insertByCriteria(DbShopmessagereportforms DbShopmessagereportforms);

    int updateByCriteria(DbShopmessagereportforms DbShopmessagereportforms);

    DbShopmessagereportforms selectByPrimaryKey(BigDecimal sequenceid);

    List<DbShopmessagereportforms> selectAll();
}