package com.bean.dao;

import com.bean.model.DbCalcuplatform;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbCalcuplatformMapper {
    DbCalcuplatform selectByCriteria(DbCalcuplatform DbCalcuplatform);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbCalcuplatform DbCalcuplatform);

    int insertByCriteria(DbCalcuplatform DbCalcuplatform);

    int updateByCriteria(DbCalcuplatform DbCalcuplatform);

    DbCalcuplatform selectByPrimaryKey(String sequenceid);

    List<DbCalcuplatform> selectAll();
}