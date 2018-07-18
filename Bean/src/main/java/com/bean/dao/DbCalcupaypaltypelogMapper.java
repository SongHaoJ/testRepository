package com.bean.dao;

import com.bean.model.DbCalcupaypaltypelog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbCalcupaypaltypelogMapper {
    DbCalcupaypaltypelog selectByCriteria(DbCalcupaypaltypelog DbCalcupaypaltypelog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbCalcupaypaltypelog DbCalcupaypaltypelog);

    int insertByCriteria(DbCalcupaypaltypelog DbCalcupaypaltypelog);

    int updateByCriteria(DbCalcupaypaltypelog DbCalcupaypaltypelog);

    DbCalcupaypaltypelog selectByPrimaryKey(String sequenceid);

    List<DbCalcupaypaltypelog> selectAll();
}