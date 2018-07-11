package com.bean.dao;

import com.bean.model.DbGeneralTemp;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbGeneralTempMapper {
    DbGeneralTemp selectByCriteria(DbGeneralTemp DbGeneralTemp);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbGeneralTemp DbGeneralTemp);

    int insertByCriteria(DbGeneralTemp DbGeneralTemp);

    int updateByCriteria(DbGeneralTemp DbGeneralTemp);

    DbGeneralTemp selectByPrimaryKey(String sequenceid);

    List<DbGeneralTemp> selectAll();
}