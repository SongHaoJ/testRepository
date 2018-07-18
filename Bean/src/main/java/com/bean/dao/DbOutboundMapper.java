package com.bean.dao;

import com.bean.model.DbOutbound;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbOutboundMapper {
    DbOutbound selectByCriteria(DbOutbound DbOutbound);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbOutbound DbOutbound);

    int insertByCriteria(DbOutbound DbOutbound);

    int updateByCriteria(DbOutbound DbOutbound);

    DbOutbound selectByPrimaryKey(BigDecimal sequenceid);

    List<DbOutbound> selectAll();
}