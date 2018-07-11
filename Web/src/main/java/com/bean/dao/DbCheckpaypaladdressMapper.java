package com.bean.dao;

import com.bean.model.DbCheckpaypaladdress;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

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