package com.bean.dao;

import com.bean.model.DbCheckpaypaladdress;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbCheckpaypaladdressMapper {
    DbCheckpaypaladdress selectByCriteria(DbCheckpaypaladdress DbCheckpaypaladdress);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbCheckpaypaladdress DbCheckpaypaladdress);

    int insertByCriteria(DbCheckpaypaladdress DbCheckpaypaladdress);

    int updateByCriteria(DbCheckpaypaladdress DbCheckpaypaladdress);

    DbCheckpaypaladdress selectByPrimaryKey(BigDecimal sid);

    List<DbCheckpaypaladdress> selectAll();
}