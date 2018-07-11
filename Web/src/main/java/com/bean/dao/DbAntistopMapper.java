package com.bean.dao;

import com.bean.model.DbAntistop;
import java.util.List;
import org.springframework.stereotype.Service;

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