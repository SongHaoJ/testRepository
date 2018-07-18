package com.bean.dao;

import com.bean.model.DbTaskcustomertype;
import org.springframework.stereotype.Service;

import java.util.List;

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