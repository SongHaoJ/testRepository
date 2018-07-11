package com.bean.dao;

import com.bean.model.DbBullet;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbBulletMapper {
    DbBullet selectByCriteria(DbBullet DbBullet);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbBullet DbBullet);

    int insertByCriteria(DbBullet DbBullet);

    int updateByCriteria(DbBullet DbBullet);

    DbBullet selectByPrimaryKey(String sequenceid);

    List<DbBullet> selectAll();
}