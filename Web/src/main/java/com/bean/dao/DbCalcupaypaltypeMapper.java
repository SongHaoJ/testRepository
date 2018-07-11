package com.bean.dao;

import com.bean.model.DbCalcupaypaltype;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbCalcupaypaltypeMapper {
    DbCalcupaypaltype selectByCriteria(DbCalcupaypaltype DbCalcupaypaltype);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbCalcupaypaltype DbCalcupaypaltype);

    int insertByCriteria(DbCalcupaypaltype DbCalcupaypaltype);

    int updateByCriteria(DbCalcupaypaltype DbCalcupaypaltype);

    DbCalcupaypaltype selectByPrimaryKey(String sequenceid);

    List<DbCalcupaypaltype> selectAll();
}