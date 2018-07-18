package com.bean.dao;

import com.bean.model.DbAddfunction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbAddfunctionMapper {
    DbAddfunction selectByCriteria(DbAddfunction DbAddfunction);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbAddfunction DbAddfunction);

    int insertByCriteria(DbAddfunction DbAddfunction);

    int updateByCriteria(DbAddfunction DbAddfunction);

    DbAddfunction selectByPrimaryKey(String sequenceid);

    List<DbAddfunction> selectAll();
}