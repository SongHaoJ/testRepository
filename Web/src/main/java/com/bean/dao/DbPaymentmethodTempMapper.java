package com.bean.dao;

import com.bean.model.DbPaymentmethodTemp;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbPaymentmethodTempMapper {
    DbPaymentmethodTemp selectByCriteria(DbPaymentmethodTemp DbPaymentmethodTemp);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbPaymentmethodTemp DbPaymentmethodTemp);

    int insertByCriteria(DbPaymentmethodTemp DbPaymentmethodTemp);

    int updateByCriteria(DbPaymentmethodTemp DbPaymentmethodTemp);

    DbPaymentmethodTemp selectByPrimaryKey(BigDecimal sid);

    List<DbPaymentmethodTemp> selectAll();
}