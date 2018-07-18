package com.bean.dao;

import com.bean.model.DbRefundpaypallog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbRefundpaypallogMapper {
    DbRefundpaypallog selectByCriteria(DbRefundpaypallog DbRefundpaypallog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbRefundpaypallog DbRefundpaypallog);

    int insertByCriteria(DbRefundpaypallog DbRefundpaypallog);

    int updateByCriteria(DbRefundpaypallog DbRefundpaypallog);

    DbRefundpaypallog selectByPrimaryKey(String sequenceid);

    List<DbRefundpaypallog> selectAll();
}