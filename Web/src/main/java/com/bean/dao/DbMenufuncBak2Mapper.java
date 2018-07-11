package com.bean.dao;

import com.bean.model.DbMenufuncBak2;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbMenufuncBak2Mapper {
    DbMenufuncBak2 selectByCriteria(DbMenufuncBak2 DbMenufuncBak2);

    void deleteByPrimaryKey(String FUNID);

    void deleteByCriteria(DbMenufuncBak2 DbMenufuncBak2);

    int insertByCriteria(DbMenufuncBak2 DbMenufuncBak2);

    int updateByCriteria(DbMenufuncBak2 DbMenufuncBak2);

    DbMenufuncBak2 selectByPrimaryKey(String funid);

    List<DbMenufuncBak2> selectAll();
}