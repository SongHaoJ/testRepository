package com.bean.dao;

import com.bean.model.DbTaskbasket;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbTaskbasketMapper {
    DbTaskbasket selectByCriteria(DbTaskbasket DbTaskbasket);

    void deleteByPrimaryKey(String BASKET);

    void deleteByCriteria(DbTaskbasket DbTaskbasket);

    int insertByCriteria(DbTaskbasket DbTaskbasket);

    int updateByCriteria(DbTaskbasket DbTaskbasket);

    DbTaskbasket selectByPrimaryKey(String basket);

    List<DbTaskbasket> selectAll();
}