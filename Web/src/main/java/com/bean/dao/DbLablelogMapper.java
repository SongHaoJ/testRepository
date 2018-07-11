package com.bean.dao;

import com.bean.model.DbLablelog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbLablelogMapper {
    DbLablelog selectByCriteria(DbLablelog DbLablelog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbLablelog DbLablelog);

    int insertByCriteria(DbLablelog DbLablelog);

    int updateByCriteria(DbLablelog DbLablelog);

    DbLablelog selectByPrimaryKey(String sequenceid);

    List<DbLablelog> selectAll();
}