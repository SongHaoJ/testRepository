package com.bean.dao;

import com.bean.model.DbYwerrorreason;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbYwerrorreasonMapper {
    DbYwerrorreason selectByCriteria(DbYwerrorreason DbYwerrorreason);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbYwerrorreason DbYwerrorreason);

    int insertByCriteria(DbYwerrorreason DbYwerrorreason);

    int updateByCriteria(DbYwerrorreason DbYwerrorreason);

    DbYwerrorreason selectByPrimaryKey(String sid);

    List<DbYwerrorreason> selectAll();
}