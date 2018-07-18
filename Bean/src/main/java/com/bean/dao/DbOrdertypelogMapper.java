package com.bean.dao;

import com.bean.model.DbOrdertypelog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbOrdertypelogMapper {
    DbOrdertypelog selectByCriteria(DbOrdertypelog DbOrdertypelog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbOrdertypelog DbOrdertypelog);

    int insertByCriteria(DbOrdertypelog DbOrdertypelog);

    int updateByCriteria(DbOrdertypelog DbOrdertypelog);

    DbOrdertypelog selectByPrimaryKey(String sequenceid);

    List<DbOrdertypelog> selectAll();
}