package com.bean.dao;

import com.bean.model.DbProductdevelopforson;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbProductdevelopforsonMapper {
    DbProductdevelopforson selectByCriteria(DbProductdevelopforson DbProductdevelopforson);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProductdevelopforson DbProductdevelopforson);

    int insertByCriteria(DbProductdevelopforson DbProductdevelopforson);

    int updateByCriteria(DbProductdevelopforson DbProductdevelopforson);

    DbProductdevelopforson selectByPrimaryKey(BigDecimal sequenceid);

    List<DbProductdevelopforson> selectAll();
}