package com.bean.dao;

import com.bean.model.DbProductfortemplet;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbProductfortempletMapper {
    DbProductfortemplet selectByCriteria(DbProductfortemplet DbProductfortemplet);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProductfortemplet DbProductfortemplet);

    int insertByCriteria(DbProductfortemplet DbProductfortemplet);

    int updateByCriteria(DbProductfortemplet DbProductfortemplet);

    DbProductfortemplet selectByPrimaryKey(BigDecimal sequenceid);

    List<DbProductfortemplet> selectAll();
}