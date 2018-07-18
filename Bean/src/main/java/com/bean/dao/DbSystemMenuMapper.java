package com.bean.dao;

import com.bean.model.DbSystemMenu;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbSystemMenuMapper {
    DbSystemMenu selectByCriteria(DbSystemMenu DbSystemMenu);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbSystemMenu DbSystemMenu);

    int insertByCriteria(DbSystemMenu DbSystemMenu);

    int updateByCriteria(DbSystemMenu DbSystemMenu);

    DbSystemMenu selectByPrimaryKey(Long id);

    List<DbSystemMenu> selectAll();
}