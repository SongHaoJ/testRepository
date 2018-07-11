package com.bean.dao;

import com.bean.model.DbCaiwu;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbCaiwuMapper {
    DbCaiwu selectByCriteria(DbCaiwu DbCaiwu);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbCaiwu DbCaiwu);

    int insertByCriteria(DbCaiwu DbCaiwu);

    int updateByCriteria(DbCaiwu DbCaiwu);

    DbCaiwu selectByPrimaryKey(String sequenceid);

    List<DbCaiwu> selectAll();
}