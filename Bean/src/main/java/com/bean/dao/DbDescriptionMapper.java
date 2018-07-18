package com.bean.dao;

import com.bean.model.DbDescription;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbDescriptionMapper {
    DbDescription selectByCriteria(DbDescription DbDescription);

    void deleteByPrimaryKey(String ITEMID);

    void deleteByCriteria(DbDescription DbDescription);

    int insertByCriteria(DbDescription DbDescription);

    int updateByCriteria(DbDescription DbDescription);

    DbDescription selectByPrimaryKey(BigDecimal itemid);

    List<DbDescription> selectAll();
}