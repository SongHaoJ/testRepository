package com.test.Dao;

import com.test.Model.Tt;
import org.springframework.stereotype.Repository;

@Repository
public interface TtDao {

    Tt selectByPrimaryKey(Long id);

    void deleteByPrimaryKey(Long id);

    void insert(Tt tt);

    void insertSelective(Tt tt);

    void updateByPrimaryKeySelective(Tt tt);

    void updateByPrimaryKey(Tt tt);

}
