package com.bean.dao;

import com.bean.model.DbProjectdesrc;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbProjectdesrcMapper {
    DbProjectdesrc selectByCriteria(DbProjectdesrc DbProjectdesrc);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProjectdesrc DbProjectdesrc);

    int insertByCriteria(DbProjectdesrc DbProjectdesrc);

    int updateByCriteria(DbProjectdesrc DbProjectdesrc);

    DbProjectdesrc selectByPrimaryKey(BigDecimal sequenceid);

    List<DbProjectdesrc> selectAll();
}