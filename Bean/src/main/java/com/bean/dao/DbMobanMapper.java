package com.bean.dao;

import com.bean.model.DbMoban;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbMobanMapper {
    DbMoban selectByCriteria(DbMoban DbMoban);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbMoban DbMoban);

    int insertByCriteria(DbMoban DbMoban);

    int updateByCriteria(DbMoban DbMoban);

    DbMoban selectByPrimaryKey(String sequenceid);

    List<DbMoban> selectAll();
}