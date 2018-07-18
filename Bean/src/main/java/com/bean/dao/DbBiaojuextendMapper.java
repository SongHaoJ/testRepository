package com.bean.dao;

import com.bean.model.DbBiaojuextend;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbBiaojuextendMapper {
    DbBiaojuextend selectByCriteria(DbBiaojuextend DbBiaojuextend);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbBiaojuextend DbBiaojuextend);

    int insertByCriteria(DbBiaojuextend DbBiaojuextend);

    int updateByCriteria(DbBiaojuextend DbBiaojuextend);

    DbBiaojuextend selectByPrimaryKey(Integer id);

    List<DbBiaojuextend> selectAll();
}