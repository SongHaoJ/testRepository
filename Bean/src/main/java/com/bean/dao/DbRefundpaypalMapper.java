package com.bean.dao;

import com.bean.model.DbRefundpaypal;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbRefundpaypalMapper {
    DbRefundpaypal selectByCriteria(DbRefundpaypal DbRefundpaypal);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbRefundpaypal DbRefundpaypal);

    int insertByCriteria(DbRefundpaypal DbRefundpaypal);

    int updateByCriteria(DbRefundpaypal DbRefundpaypal);

    DbRefundpaypal selectByPrimaryKey(String sequenceid);

    List<DbRefundpaypal> selectAll();
}