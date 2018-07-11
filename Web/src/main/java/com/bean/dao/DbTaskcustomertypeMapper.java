package com.bean.dao;

import com.bean.model.DbTaskcustomertype;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbTaskcustomertypeMapper {
    DbTaskcustomertype selectByCriteria(DbTaskcustomertype DbTaskcustomertype);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbTaskcustomertype DbTaskcustomertype);

    int insertByCriteria(DbTaskcustomertype DbTaskcustomertype);

    int updateByCriteria(DbTaskcustomertype DbTaskcustomertype);

    DbTaskcustomertype selectByPrimaryKey(String sequenceid);

    List<DbTaskcustomertype> selectAll();
}