package com.bean.dao;

import com.bean.model.DbShiptolocation;
import java.util.List;
import org.springframework.stereotype.Service;

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