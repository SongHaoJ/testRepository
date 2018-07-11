package com.bean.dao;

import com.bean.model.DbBiaojuexpresstype;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbBiaojuexpresstypeMapper {
    DbBiaojuexpresstype selectByCriteria(DbBiaojuexpresstype DbBiaojuexpresstype);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbBiaojuexpresstype DbBiaojuexpresstype);

    int insertByCriteria(DbBiaojuexpresstype DbBiaojuexpresstype);

    int updateByCriteria(DbBiaojuexpresstype DbBiaojuexpresstype);

    DbBiaojuexpresstype selectByPrimaryKey(Integer id);

    List<DbBiaojuexpresstype> selectAll();
}