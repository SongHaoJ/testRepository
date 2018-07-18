package com.bean.dao;

import com.bean.model.DbTestpaypal;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbTestpaypalMapper {
    DbTestpaypal selectByCriteria(DbTestpaypal DbTestpaypal);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbTestpaypal DbTestpaypal);

    int insertByCriteria(DbTestpaypal DbTestpaypal);

    int updateByCriteria(DbTestpaypal DbTestpaypal);

    DbTestpaypal selectByPrimaryKey(String sid);

    List<DbTestpaypal> selectAll();
}