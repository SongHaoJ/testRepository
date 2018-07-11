package com.bean.dao;

import com.bean.model.DbUspsseller;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbUspssellerMapper {
    DbUspsseller selectByCriteria(DbUspsseller DbUspsseller);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbUspsseller DbUspsseller);

    int insertByCriteria(DbUspsseller DbUspsseller);

    int updateByCriteria(DbUspsseller DbUspsseller);

    DbUspsseller selectByPrimaryKey(String sid);

    List<DbUspsseller> selectAll();
}