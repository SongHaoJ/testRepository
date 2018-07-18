package com.bean.dao;

import com.bean.model.DbProjectbbs;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbProjectbbsMapper {
    DbProjectbbs selectByCriteria(DbProjectbbs DbProjectbbs);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProjectbbs DbProjectbbs);

    int insertByCriteria(DbProjectbbs DbProjectbbs);

    int updateByCriteria(DbProjectbbs DbProjectbbs);

    DbProjectbbs selectByPrimaryKey(BigDecimal sequenceid);

    List<DbProjectbbs> selectAll();
}