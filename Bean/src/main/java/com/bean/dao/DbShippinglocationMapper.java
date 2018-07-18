package com.bean.dao;

import com.bean.model.DbShippinglocation;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbShippinglocationMapper {
    DbShippinglocation selectByCriteria(DbShippinglocation DbShippinglocation);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbShippinglocation DbShippinglocation);

    int insertByCriteria(DbShippinglocation DbShippinglocation);

    int updateByCriteria(DbShippinglocation DbShippinglocation);

    DbShippinglocation selectByPrimaryKey(BigDecimal sid);

    List<DbShippinglocation> selectAll();
}