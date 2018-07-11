package com.bean.dao;

import com.bean.model.DbProductfordescr;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbProductfordescrMapper {
    DbProductfordescr selectByCriteria(DbProductfordescr DbProductfordescr);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProductfordescr DbProductfordescr);

    int insertByCriteria(DbProductfordescr DbProductfordescr);

    int updateByCriteria(DbProductfordescr DbProductfordescr);

    DbProductfordescr selectByPrimaryKey(BigDecimal sequenceid);

    List<DbProductfordescr> selectAll();
}