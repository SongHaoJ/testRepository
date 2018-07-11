package com.bean.dao;

import com.bean.model.DbCalculateitem;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbCalculateitemMapper {
    DbCalculateitem selectByCriteria(DbCalculateitem DbCalculateitem);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbCalculateitem DbCalculateitem);

    int insertByCriteria(DbCalculateitem DbCalculateitem);

    int updateByCriteria(DbCalculateitem DbCalculateitem);

    DbCalculateitem selectByPrimaryKey(String sid);

    List<DbCalculateitem> selectAll();
}