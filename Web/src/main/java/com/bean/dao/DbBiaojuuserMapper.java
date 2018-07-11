package com.bean.dao;

import com.bean.model.DbBiaojuuser;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbBiaojuuserMapper {
    DbBiaojuuser selectByCriteria(DbBiaojuuser DbBiaojuuser);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbBiaojuuser DbBiaojuuser);

    int insertByCriteria(DbBiaojuuser DbBiaojuuser);

    int updateByCriteria(DbBiaojuuser DbBiaojuuser);

    DbBiaojuuser selectByPrimaryKey(Integer id);

    List<DbBiaojuuser> selectAll();
}