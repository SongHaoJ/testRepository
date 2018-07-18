package com.bean.dao;

import com.bean.model.DbProductinfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbProductinfoMapper {
    DbProductinfo selectByCriteria(DbProductinfo DbProductinfo);

    void deleteByPrimaryKey(String SKUID);

    void deleteByCriteria(DbProductinfo DbProductinfo);

    int insertByCriteria(DbProductinfo DbProductinfo);

    int updateByCriteria(DbProductinfo DbProductinfo);

    DbProductinfo selectByPrimaryKey(String skuid);

    List<DbProductinfo> selectAll();
}