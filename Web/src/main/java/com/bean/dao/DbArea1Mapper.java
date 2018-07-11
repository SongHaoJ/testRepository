package com.bean.dao;

import com.bean.model.DbArea1;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbArea1Mapper {
    DbArea1 selectByCriteria(DbArea1 DbArea1);

    void deleteByPrimaryKey(String AREA);

    void deleteByCriteria(DbArea1 DbArea1);

    int insertByCriteria(DbArea1 DbArea1);

    int updateByCriteria(DbArea1 DbArea1);

    DbArea1 selectByPrimaryKey(String area);

    List<DbArea1> selectAll();
}