package com.bean.dao;

import com.bean.model.DbTaskitemid;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbTaskitemidMapper {
    DbTaskitemid selectByCriteria(DbTaskitemid DbTaskitemid);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbTaskitemid DbTaskitemid);

    int insertByCriteria(DbTaskitemid DbTaskitemid);

    int updateByCriteria(DbTaskitemid DbTaskitemid);

    DbTaskitemid selectByPrimaryKey(String sid);

    List<DbTaskitemid> selectAll();
}