package com.bean.dao;

import com.bean.model.DbCaiwudeploy;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbCaiwudeployMapper {
    DbCaiwudeploy selectByCriteria(DbCaiwudeploy DbCaiwudeploy);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbCaiwudeploy DbCaiwudeploy);

    int insertByCriteria(DbCaiwudeploy DbCaiwudeploy);

    int updateByCriteria(DbCaiwudeploy DbCaiwudeploy);

    DbCaiwudeploy selectByPrimaryKey(String sequenceid);

    List<DbCaiwudeploy> selectAll();
}