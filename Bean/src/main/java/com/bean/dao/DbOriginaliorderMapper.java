package com.bean.dao;

import com.bean.model.DbOriginaliorder;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbOriginaliorderMapper {
    DbOriginaliorder selectByCriteria(DbOriginaliorder DbOriginaliorder);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbOriginaliorder DbOriginaliorder);

    int insertByCriteria(DbOriginaliorder DbOriginaliorder);

    int updateByCriteria(DbOriginaliorder DbOriginaliorder);

    DbOriginaliorder selectByPrimaryKey(BigDecimal id);

    List<DbOriginaliorder> selectAll();
}