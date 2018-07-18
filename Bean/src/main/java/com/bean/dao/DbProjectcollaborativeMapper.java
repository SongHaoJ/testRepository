package com.bean.dao;

import com.bean.model.DbProjectcollaborative;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbProjectcollaborativeMapper {
    DbProjectcollaborative selectByCriteria(DbProjectcollaborative DbProjectcollaborative);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProjectcollaborative DbProjectcollaborative);

    int insertByCriteria(DbProjectcollaborative DbProjectcollaborative);

    int updateByCriteria(DbProjectcollaborative DbProjectcollaborative);

    DbProjectcollaborative selectByPrimaryKey(BigDecimal sequenceid);

    List<DbProjectcollaborative> selectAll();
}