package com.bean.dao;

import com.bean.model.DbPaymentmethod;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbPaymentmethodMapper {
    DbPaymentmethod selectByCriteria(DbPaymentmethod DbPaymentmethod);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbPaymentmethod DbPaymentmethod);

    int insertByCriteria(DbPaymentmethod DbPaymentmethod);

    int updateByCriteria(DbPaymentmethod DbPaymentmethod);

    DbPaymentmethod selectByPrimaryKey(BigDecimal sid);

    List<DbPaymentmethod> selectAll();
}