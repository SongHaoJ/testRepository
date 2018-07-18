package com.bean.dao;

import com.bean.model.DbReturnInstorage;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbReturnInstorageMapper {
    DbReturnInstorage selectByCriteria(DbReturnInstorage DbReturnInstorage);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbReturnInstorage DbReturnInstorage);

    int insertByCriteria(DbReturnInstorage DbReturnInstorage);

    int updateByCriteria(DbReturnInstorage DbReturnInstorage);

    DbReturnInstorage selectByPrimaryKey(BigDecimal sequenceid);

    List<DbReturnInstorage> selectAll();
}