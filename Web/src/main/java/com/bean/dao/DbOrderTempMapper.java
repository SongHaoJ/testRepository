package com.bean.dao;

import com.bean.model.DbOrderTemp;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbOrderTempMapper {
    DbOrderTemp selectByCriteria(DbOrderTemp DbOrderTemp);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbOrderTemp DbOrderTemp);

    int insertByCriteria(DbOrderTemp DbOrderTemp);

    int updateByCriteria(DbOrderTemp DbOrderTemp);

    DbOrderTemp selectByPrimaryKey(String sequenceid);

    List<DbOrderTemp> selectAll();
}