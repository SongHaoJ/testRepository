package com.bean.dao;

import com.bean.model.DbMymabang;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbMymabangMapper {
    DbMymabang selectByCriteria(DbMymabang DbMymabang);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbMymabang DbMymabang);

    int insertByCriteria(DbMymabang DbMymabang);

    int updateByCriteria(DbMymabang DbMymabang);

    DbMymabang selectByPrimaryKey(BigDecimal sequenceid);

    List<DbMymabang> selectAll();
}