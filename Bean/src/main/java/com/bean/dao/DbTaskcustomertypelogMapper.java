package com.bean.dao;

import com.bean.model.DbTaskcustomertypelog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbTaskcustomertypelogMapper {
    DbTaskcustomertypelog selectByCriteria(DbTaskcustomertypelog DbTaskcustomertypelog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbTaskcustomertypelog DbTaskcustomertypelog);

    int insertByCriteria(DbTaskcustomertypelog DbTaskcustomertypelog);

    int updateByCriteria(DbTaskcustomertypelog DbTaskcustomertypelog);

    DbTaskcustomertypelog selectByPrimaryKey(String sequenceid);

    List<DbTaskcustomertypelog> selectAll();
}