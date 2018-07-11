package com.bean.dao;

import com.bean.model.DbOrdertype;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbOrdertypeMapper {
    DbOrdertype selectByCriteria(DbOrdertype DbOrdertype);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbOrdertype DbOrdertype);

    int insertByCriteria(DbOrdertype DbOrdertype);

    int updateByCriteria(DbOrdertype DbOrdertype);

    DbOrdertype selectByPrimaryKey(String sequenceid);

    List<DbOrdertype> selectAll();
}