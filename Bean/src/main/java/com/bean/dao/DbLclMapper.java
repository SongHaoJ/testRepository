package com.bean.dao;

import com.bean.model.DbLcl;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbLclMapper {
    DbLcl selectByCriteria(DbLcl DbLcl);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbLcl DbLcl);

    int insertByCriteria(DbLcl DbLcl);

    int updateByCriteria(DbLcl DbLcl);

    DbLcl selectByPrimaryKey(BigDecimal sequenceid);

    List<DbLcl> selectAll();
}