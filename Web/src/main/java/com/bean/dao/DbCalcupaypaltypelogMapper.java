package com.bean.dao;

import com.bean.model.DbCalcupaypaltypelog;
import java.util.List;
import org.springframework.stereotype.Service;

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