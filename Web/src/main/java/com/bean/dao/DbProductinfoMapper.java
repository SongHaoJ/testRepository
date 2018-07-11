package com.bean.dao;

import com.bean.model.DbProductinfo;
import java.util.List;
import org.springframework.stereotype.Service;

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