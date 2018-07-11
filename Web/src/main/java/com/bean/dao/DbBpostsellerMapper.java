package com.bean.dao;

import com.bean.model.DbBpostseller;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbBpostsellerMapper {
    DbBpostseller selectByCriteria(DbBpostseller DbBpostseller);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbBpostseller DbBpostseller);

    int insertByCriteria(DbBpostseller DbBpostseller);

    int updateByCriteria(DbBpostseller DbBpostseller);

    DbBpostseller selectByPrimaryKey(BigDecimal sid);

    List<DbBpostseller> selectAll();
}