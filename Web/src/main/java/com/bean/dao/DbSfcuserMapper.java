package com.bean.dao;

import com.bean.model.DbSfcuser;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbSfcuserMapper {
    DbSfcuser selectByCriteria(DbSfcuser DbSfcuser);

    void deleteByPrimaryKey(String USERID);

    void deleteByCriteria(DbSfcuser DbSfcuser);

    int insertByCriteria(DbSfcuser DbSfcuser);

    int updateByCriteria(DbSfcuser DbSfcuser);

    DbSfcuser selectByPrimaryKey(String userid);

    List<DbSfcuser> selectAll();
}