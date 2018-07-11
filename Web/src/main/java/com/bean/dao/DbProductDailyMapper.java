package com.bean.dao;

import com.bean.model.DbProductDaily;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbProductDailyMapper {
    DbProductDaily selectByCriteria(DbProductDaily DbProductDaily);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProductDaily DbProductDaily);

    int insertByCriteria(DbProductDaily DbProductDaily);

    int updateByCriteria(DbProductDaily DbProductDaily);

    DbProductDaily selectByPrimaryKey(String sequenceid);

    List<DbProductDaily> selectAll();
}