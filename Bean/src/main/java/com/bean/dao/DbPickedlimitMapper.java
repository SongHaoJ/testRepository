package com.bean.dao;

import com.bean.model.DbPickedlimit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbPickedlimitMapper {
    DbPickedlimit selectByCriteria(DbPickedlimit DbPickedlimit);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbPickedlimit DbPickedlimit);

    int insertByCriteria(DbPickedlimit DbPickedlimit);

    int updateByCriteria(DbPickedlimit DbPickedlimit);

    DbPickedlimit selectByPrimaryKey(Integer id);

    List<DbPickedlimit> selectAll();
}