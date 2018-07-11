package com.bean.dao;

import com.bean.model.DbSmsprompttypelog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbSmsprompttypelogMapper {
    DbSmsprompttypelog selectByCriteria(DbSmsprompttypelog DbSmsprompttypelog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbSmsprompttypelog DbSmsprompttypelog);

    int insertByCriteria(DbSmsprompttypelog DbSmsprompttypelog);

    int updateByCriteria(DbSmsprompttypelog DbSmsprompttypelog);

    DbSmsprompttypelog selectByPrimaryKey(String sequenceid);

    List<DbSmsprompttypelog> selectAll();
}