package com.bean.dao;

import com.bean.model.DbItemspevalue;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbItemspevalueMapper {
    DbItemspevalue selectByCriteria(DbItemspevalue DbItemspevalue);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbItemspevalue DbItemspevalue);

    int insertByCriteria(DbItemspevalue DbItemspevalue);

    int updateByCriteria(DbItemspevalue DbItemspevalue);

    DbItemspevalue selectByPrimaryKey(String sid);

    List<DbItemspevalue> selectAll();
}