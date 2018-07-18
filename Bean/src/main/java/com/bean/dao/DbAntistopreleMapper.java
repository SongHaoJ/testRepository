package com.bean.dao;

import com.bean.model.DbAntistoprele;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbAntistopreleMapper {
    DbAntistoprele selectByCriteria(DbAntistoprele DbAntistoprele);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbAntistoprele DbAntistoprele);

    int insertByCriteria(DbAntistoprele DbAntistoprele);

    int updateByCriteria(DbAntistoprele DbAntistoprele);

    DbAntistoprele selectByPrimaryKey(String sequenceid);

    List<DbAntistoprele> selectAll();
}