package com.bean.dao;

import com.bean.model.DbSalescoefficientlog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbSalescoefficientlogMapper {
    DbSalescoefficientlog selectByCriteria(DbSalescoefficientlog DbSalescoefficientlog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbSalescoefficientlog DbSalescoefficientlog);

    int insertByCriteria(DbSalescoefficientlog DbSalescoefficientlog);

    int updateByCriteria(DbSalescoefficientlog DbSalescoefficientlog);

    DbSalescoefficientlog selectByPrimaryKey(String sequenceid);

    List<DbSalescoefficientlog> selectAll();
}