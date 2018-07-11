package com.bean.dao;

import com.bean.model.DbTasktype;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbTasktypeMapper {
    DbTasktype selectByCriteria(DbTasktype DbTasktype);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbTasktype DbTasktype);

    int insertByCriteria(DbTasktype DbTasktype);

    int updateByCriteria(DbTasktype DbTasktype);

    DbTasktype selectByPrimaryKey(String sequenceid);

    List<DbTasktype> selectAll();
}