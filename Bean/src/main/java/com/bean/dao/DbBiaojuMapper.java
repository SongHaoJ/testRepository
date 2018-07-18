package com.bean.dao;

import com.bean.model.DbBiaoju;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbBiaojuMapper {
    DbBiaoju selectByCriteria(DbBiaoju DbBiaoju);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbBiaoju DbBiaoju);

    int insertByCriteria(DbBiaoju DbBiaoju);

    int updateByCriteria(DbBiaoju DbBiaoju);

    DbBiaoju selectByPrimaryKey(Integer id);

    List<DbBiaoju> selectAll();
}