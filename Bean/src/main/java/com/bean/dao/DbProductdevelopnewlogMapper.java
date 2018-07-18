package com.bean.dao;

import com.bean.model.DbProductdevelopnewlog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbProductdevelopnewlogMapper {
    DbProductdevelopnewlog selectByCriteria(DbProductdevelopnewlog DbProductdevelopnewlog);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbProductdevelopnewlog DbProductdevelopnewlog);

    int insertByCriteria(DbProductdevelopnewlog DbProductdevelopnewlog);

    int updateByCriteria(DbProductdevelopnewlog DbProductdevelopnewlog);

    DbProductdevelopnewlog selectByPrimaryKey(String sid);

    List<DbProductdevelopnewlog> selectAll();
}