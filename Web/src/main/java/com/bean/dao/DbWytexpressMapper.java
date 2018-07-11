package com.bean.dao;

import com.bean.model.DbWytexpress;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbWytexpressMapper {
    DbWytexpress selectByCriteria(DbWytexpress DbWytexpress);

    void deleteByPrimaryKey(String DELIVERYWAYID);

    void deleteByCriteria(DbWytexpress DbWytexpress);

    int insertByCriteria(DbWytexpress DbWytexpress);

    int updateByCriteria(DbWytexpress DbWytexpress);

    DbWytexpress selectByPrimaryKey(String deliverywayid);

    List<DbWytexpress> selectAll();
}