package com.bean.dao;

import com.bean.model.DbMenufuncBak;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbMenufuncBakMapper {
    DbMenufuncBak selectByCriteria(DbMenufuncBak DbMenufuncBak);

    void deleteByPrimaryKey(String FUNID);

    void deleteByCriteria(DbMenufuncBak DbMenufuncBak);

    int insertByCriteria(DbMenufuncBak DbMenufuncBak);

    int updateByCriteria(DbMenufuncBak DbMenufuncBak);

    DbMenufuncBak selectByPrimaryKey(String funid);

    List<DbMenufuncBak> selectAll();
}