package com.bean.dao;

import com.bean.model.DbProductfortitle;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbProductfortitleMapper {
    DbProductfortitle selectByCriteria(DbProductfortitle DbProductfortitle);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProductfortitle DbProductfortitle);

    int insertByCriteria(DbProductfortitle DbProductfortitle);

    int updateByCriteria(DbProductfortitle DbProductfortitle);

    DbProductfortitle selectByPrimaryKey(BigDecimal sequenceid);

    List<DbProductfortitle> selectAll();
}