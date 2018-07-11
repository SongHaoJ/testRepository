package com.bean.dao;

import com.bean.model.DbExpresstypelog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbExpresstypelogMapper {
    DbExpresstypelog selectByCriteria(DbExpresstypelog DbExpresstypelog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbExpresstypelog DbExpresstypelog);

    int insertByCriteria(DbExpresstypelog DbExpresstypelog);

    int updateByCriteria(DbExpresstypelog DbExpresstypelog);

    DbExpresstypelog selectByPrimaryKey(String sequenceid);

    List<DbExpresstypelog> selectAll();
}