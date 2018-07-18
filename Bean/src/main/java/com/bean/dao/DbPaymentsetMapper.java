package com.bean.dao;

import com.bean.model.DbPaymentset;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbPaymentsetMapper {
    DbPaymentset selectByCriteria(DbPaymentset DbPaymentset);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbPaymentset DbPaymentset);

    int insertByCriteria(DbPaymentset DbPaymentset);

    int updateByCriteria(DbPaymentset DbPaymentset);

    DbPaymentset selectByPrimaryKey(String sequenceid);

    List<DbPaymentset> selectAll();
}