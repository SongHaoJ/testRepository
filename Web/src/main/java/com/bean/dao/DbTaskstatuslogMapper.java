package com.bean.dao;

import com.bean.model.DbTaskstatuslog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbTaskstatuslogMapper {
    DbTaskstatuslog selectByCriteria(DbTaskstatuslog DbTaskstatuslog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbTaskstatuslog DbTaskstatuslog);

    int insertByCriteria(DbTaskstatuslog DbTaskstatuslog);

    int updateByCriteria(DbTaskstatuslog DbTaskstatuslog);

    DbTaskstatuslog selectByPrimaryKey(String sequenceid);

    List<DbTaskstatuslog> selectAll();
}