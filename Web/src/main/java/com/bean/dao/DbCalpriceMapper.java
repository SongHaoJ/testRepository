package com.bean.dao;

import com.bean.model.DbCalprice;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbCalpriceMapper {
    DbCalprice selectByCriteria(DbCalprice DbCalprice);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbCalprice DbCalprice);

    int insertByCriteria(DbCalprice DbCalprice);

    int updateByCriteria(DbCalprice DbCalprice);

    DbCalprice selectByPrimaryKey(String sequenceid);

    List<DbCalprice> selectAll();
}