package com.bean.dao;

import com.bean.model.DbDescription;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

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