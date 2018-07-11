package com.bean.dao;

import com.bean.model.DbAsktradernumber;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbAsktradernumberMapper {
    DbAsktradernumber selectByCriteria(DbAsktradernumber DbAsktradernumber);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbAsktradernumber DbAsktradernumber);

    int insertByCriteria(DbAsktradernumber DbAsktradernumber);

    int updateByCriteria(DbAsktradernumber DbAsktradernumber);

    DbAsktradernumber selectByPrimaryKey(String sequenceid);

    List<DbAsktradernumber> selectAll();
}