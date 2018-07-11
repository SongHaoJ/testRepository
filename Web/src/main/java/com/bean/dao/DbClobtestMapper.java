package com.bean.dao;

import com.bean.model.DbClobtest;
import java.util.List;
import org.springframework.stereotype.Service;

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