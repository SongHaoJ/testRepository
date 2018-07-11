package com.bean.dao;

import com.bean.model.DbProductOnlineTemp;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbProductOnlineTempMapper {
    DbProductOnlineTemp selectByCriteria(DbProductOnlineTemp DbProductOnlineTemp);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProductOnlineTemp DbProductOnlineTemp);

    int insertByCriteria(DbProductOnlineTemp DbProductOnlineTemp);

    int updateByCriteria(DbProductOnlineTemp DbProductOnlineTemp);

    DbProductOnlineTemp selectByPrimaryKey(String sequenceid);

    List<DbProductOnlineTemp> selectAll();
}