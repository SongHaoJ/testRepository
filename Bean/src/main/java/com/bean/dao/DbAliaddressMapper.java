package com.bean.dao;

import com.bean.model.DbAliaddress;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbAliaddressMapper {
    DbAliaddress selectByCriteria(DbAliaddress DbAliaddress);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbAliaddress DbAliaddress);

    int insertByCriteria(DbAliaddress DbAliaddress);

    int updateByCriteria(DbAliaddress DbAliaddress);

    DbAliaddress selectByPrimaryKey(String sid);

    List<DbAliaddress> selectAll();
}