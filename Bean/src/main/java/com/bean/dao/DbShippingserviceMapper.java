package com.bean.dao;

import com.bean.model.DbShippingservice;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbShippingserviceMapper {
    DbShippingservice selectByCriteria(DbShippingservice DbShippingservice);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbShippingservice DbShippingservice);

    int insertByCriteria(DbShippingservice DbShippingservice);

    int updateByCriteria(DbShippingservice DbShippingservice);

    DbShippingservice selectByPrimaryKey(BigDecimal sid);

    List<DbShippingservice> selectAll();
}