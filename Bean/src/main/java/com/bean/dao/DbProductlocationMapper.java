package com.bean.dao;

import com.bean.model.DbProductlocation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbProductlocationMapper {
    DbProductlocation selectByCriteria(DbProductlocation DbProductlocation);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbProductlocation DbProductlocation);

    int insertByCriteria(DbProductlocation DbProductlocation);

    int updateByCriteria(DbProductlocation DbProductlocation);

    DbProductlocation selectByPrimaryKey(Long id);

    List<DbProductlocation> selectAll();
}