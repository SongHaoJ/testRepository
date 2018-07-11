package com.bean.dao;

import com.bean.model.DbLcl;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

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