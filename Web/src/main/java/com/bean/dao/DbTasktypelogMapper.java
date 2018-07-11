package com.bean.dao;

import com.bean.model.DbTasktypelog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbTasktypelogMapper {
    DbTasktypelog selectByCriteria(DbTasktypelog DbTasktypelog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbTasktypelog DbTasktypelog);

    int insertByCriteria(DbTasktypelog DbTasktypelog);

    int updateByCriteria(DbTasktypelog DbTasktypelog);

    DbTasktypelog selectByPrimaryKey(String sequenceid);

    List<DbTasktypelog> selectAll();
}