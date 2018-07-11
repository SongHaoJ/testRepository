package com.bean.dao;

import com.bean.model.DbAliaddress;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbAliaddressMapper {
    DbAliaddress selectByCriteria(DbAliaddress DbAliaddress);

    void deleteByPrimaryKey(String db_order);

    void deleteByCriteria(DbAliaddress DbAliaddress);

    int insertByCriteria(DbAliaddress DbAliaddress);

    int updateByCriteria(DbAliaddress DbAliaddress);

    DbAliaddress selectByPrimaryKey(String dbOrder);

    List<DbAliaddress> selectAll();
}