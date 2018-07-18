package com.bean.dao;

import com.bean.model.DbPerstaprivilege;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbPerstaprivilegeMapper {
    DbPerstaprivilege selectByCriteria(DbPerstaprivilege DbPerstaprivilege);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbPerstaprivilege DbPerstaprivilege);

    int insertByCriteria(DbPerstaprivilege DbPerstaprivilege);

    int updateByCriteria(DbPerstaprivilege DbPerstaprivilege);

    DbPerstaprivilege selectByPrimaryKey(String sequenceid);

    List<DbPerstaprivilege> selectAll();
}