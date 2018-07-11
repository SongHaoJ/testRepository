package com.bean.dao;

import com.bean.model.DbBullettype;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbBullettypeMapper {
    DbBullettype selectByCriteria(DbBullettype DbBullettype);

    void deleteByPrimaryKey(String BULLETTYPE);

    void deleteByCriteria(DbBullettype DbBullettype);

    int insertByCriteria(DbBullettype DbBullettype);

    int updateByCriteria(DbBullettype DbBullettype);

    DbBullettype selectByPrimaryKey(BigDecimal bullettype);

    List<DbBullettype> selectAll();
}