package com.bean.dao;

import com.bean.model.DbMoban;
import java.util.List;
import org.springframework.stereotype.Service;

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