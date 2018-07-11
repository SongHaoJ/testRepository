package com.bean.dao;

import com.bean.model.DbBiaoju;
import java.util.List;
import org.springframework.stereotype.Service;

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