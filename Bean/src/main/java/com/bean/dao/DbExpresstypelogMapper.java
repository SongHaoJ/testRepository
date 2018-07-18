package com.bean.dao;

import com.bean.model.DbExpresstypelog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbExpresstypelogMapper {
    DbExpresstypelog selectByCriteria(DbExpresstypelog DbExpresstypelog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbExpresstypelog DbExpresstypelog);

    int insertByCriteria(DbExpresstypelog DbExpresstypelog);

    int updateByCriteria(DbExpresstypelog DbExpresstypelog);

    DbExpresstypelog selectByPrimaryKey(String sequenceid);

    List<DbExpresstypelog> selectAll();
}