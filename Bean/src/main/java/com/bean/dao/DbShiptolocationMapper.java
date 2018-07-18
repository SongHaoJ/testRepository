package com.bean.dao;

import com.bean.model.DbShiptolocation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbShiptolocationMapper {
    DbShiptolocation selectByCriteria(DbShiptolocation DbShiptolocation);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbShiptolocation DbShiptolocation);

    int insertByCriteria(DbShiptolocation DbShiptolocation);

    int updateByCriteria(DbShiptolocation DbShiptolocation);

    DbShiptolocation selectByPrimaryKey(String sid);

    List<DbShiptolocation> selectAll();
}