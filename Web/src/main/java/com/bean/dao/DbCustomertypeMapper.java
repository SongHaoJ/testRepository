package com.bean.dao;

import com.bean.model.DbCustomertype;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbCustomertypeMapper {
    DbCustomertype selectByCriteria(DbCustomertype DbCustomertype);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbCustomertype DbCustomertype);

    int insertByCriteria(DbCustomertype DbCustomertype);

    int updateByCriteria(DbCustomertype DbCustomertype);

    DbCustomertype selectByPrimaryKey(BigDecimal sid);

    List<DbCustomertype> selectAll();
}