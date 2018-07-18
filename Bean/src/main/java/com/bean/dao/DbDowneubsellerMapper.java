package com.bean.dao;

import com.bean.model.DbDowneubseller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbDowneubsellerMapper {
    DbDowneubseller selectByCriteria(DbDowneubseller DbDowneubseller);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbDowneubseller DbDowneubseller);

    int insertByCriteria(DbDowneubseller DbDowneubseller);

    int updateByCriteria(DbDowneubseller DbDowneubseller);

    DbDowneubseller selectByPrimaryKey(String sid);

    List<DbDowneubseller> selectAll();
}