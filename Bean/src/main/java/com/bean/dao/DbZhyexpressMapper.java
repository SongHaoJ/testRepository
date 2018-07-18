package com.bean.dao;

import com.bean.model.DbZhyexpress;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbZhyexpressMapper {
    DbZhyexpress selectByCriteria(DbZhyexpress DbZhyexpress);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbZhyexpress DbZhyexpress);

    int insertByCriteria(DbZhyexpress DbZhyexpress);

    int updateByCriteria(DbZhyexpress DbZhyexpress);

    DbZhyexpress selectByPrimaryKey(BigDecimal sequenceid);

    List<DbZhyexpress> selectAll();
}