package com.bean.dao;

import com.bean.model.DbClobtest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbClobtestMapper {
    DbClobtest selectByCriteria(DbClobtest DbClobtest);

    void deleteByPrimaryKey(String CID);

    void deleteByCriteria(DbClobtest DbClobtest);

    int insertByCriteria(DbClobtest DbClobtest);

    int updateByCriteria(DbClobtest DbClobtest);

    DbClobtest selectByPrimaryKey(String cid);

    List<DbClobtest> selectAll();
}