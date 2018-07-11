package com.bean.dao;

import com.bean.model.DbRefundpaypallog;
import java.util.List;
import org.springframework.stereotype.Service;

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