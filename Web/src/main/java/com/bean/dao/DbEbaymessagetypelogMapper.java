package com.bean.dao;

import com.bean.model.DbEbaymessagetypelog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbEbaymessagetypelogMapper {
    DbEbaymessagetypelog selectByCriteria(DbEbaymessagetypelog DbEbaymessagetypelog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbaymessagetypelog DbEbaymessagetypelog);

    int insertByCriteria(DbEbaymessagetypelog DbEbaymessagetypelog);

    int updateByCriteria(DbEbaymessagetypelog DbEbaymessagetypelog);

    DbEbaymessagetypelog selectByPrimaryKey(String sequenceid);

    List<DbEbaymessagetypelog> selectAll();
}