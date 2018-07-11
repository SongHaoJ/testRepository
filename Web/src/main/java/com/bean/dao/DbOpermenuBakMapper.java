package com.bean.dao;

import com.bean.model.DbOpermenuBak;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbOpermenuBakMapper {
    DbOpermenuBak selectByCriteria(DbOpermenuBak DbOpermenuBak);

    void deleteByPrimaryKey(String OPER);

    void deleteByCriteria(DbOpermenuBak DbOpermenuBak);

    int insertByCriteria(DbOpermenuBak DbOpermenuBak);

    int updateByCriteria(DbOpermenuBak DbOpermenuBak);

    DbOpermenuBak selectByPrimaryKey(String oper);

    List<DbOpermenuBak> selectAll();
}