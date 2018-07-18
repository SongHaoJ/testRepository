package com.bean.dao;

import com.bean.model.DbAntistop;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbAntistopMapper {
    DbAntistop selectByCriteria(DbAntistop DbAntistop);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbAntistop DbAntistop);

    int insertByCriteria(DbAntistop DbAntistop);

    int updateByCriteria(DbAntistop DbAntistop);

    DbAntistop selectByPrimaryKey(String sequenceid);

    List<DbAntistop> selectAll();
}