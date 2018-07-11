package com.bean.dao;

import com.bean.model.DbTempsavenum;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbTempsavenumMapper {
    DbTempsavenum selectByCriteria(DbTempsavenum DbTempsavenum);

    void deleteByPrimaryKey(String PRODUCTID);

    void deleteByCriteria(DbTempsavenum DbTempsavenum);

    int insertByCriteria(DbTempsavenum DbTempsavenum);

    int updateByCriteria(DbTempsavenum DbTempsavenum);

    DbTempsavenum selectByPrimaryKey(String productid);

    List<DbTempsavenum> selectAll();
}