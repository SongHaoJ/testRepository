package com.bean.dao;

import com.bean.model.DbSmsprompttypelog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbSmsprompttypelogMapper {
    DbSmsprompttypelog selectByCriteria(DbSmsprompttypelog DbSmsprompttypelog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbSmsprompttypelog DbSmsprompttypelog);

    int insertByCriteria(DbSmsprompttypelog DbSmsprompttypelog);

    int updateByCriteria(DbSmsprompttypelog DbSmsprompttypelog);

    DbSmsprompttypelog selectByPrimaryKey(String sequenceid);

    List<DbSmsprompttypelog> selectAll();
}