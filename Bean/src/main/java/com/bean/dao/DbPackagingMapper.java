package com.bean.dao;

import com.bean.model.DbPackaging;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbPackagingMapper {
    DbPackaging selectByCriteria(DbPackaging DbPackaging);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbPackaging DbPackaging);

    int insertByCriteria(DbPackaging DbPackaging);

    int updateByCriteria(DbPackaging DbPackaging);

    DbPackaging selectByPrimaryKey(String sequenceid);

    List<DbPackaging> selectAll();
}