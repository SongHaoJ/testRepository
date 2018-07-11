package com.bean.dao;

import com.bean.model.DbMenufunc;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbMenufuncMapper {
    DbMenufunc selectByCriteria(DbMenufunc DbMenufunc);

    void deleteByPrimaryKey(String FUNID);

    void deleteByCriteria(DbMenufunc DbMenufunc);

    int insertByCriteria(DbMenufunc DbMenufunc);

    int updateByCriteria(DbMenufunc DbMenufunc);

    DbMenufunc selectByPrimaryKey(String funid);

    List<DbMenufunc> selectAll();
}