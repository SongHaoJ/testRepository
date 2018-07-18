package com.bean.dao;

import com.bean.model.DbExpressconfig;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbExpressconfigMapper {
    int deleteByPrimaryKey(Short id);

    int insert(DbExpressconfig record);

    int insertSelective(DbExpressconfig record);

    DbExpressconfig selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(DbExpressconfig record);

    List<DbExpressconfig> selectConfigByOrderTYpes(String ordertypes);
}