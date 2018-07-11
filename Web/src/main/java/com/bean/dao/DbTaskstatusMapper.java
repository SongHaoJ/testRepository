package com.bean.dao;

import com.bean.model.DbTaskstatus;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbTaskstatusMapper {
    DbTaskstatus selectByCriteria(DbTaskstatus DbTaskstatus);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbTaskstatus DbTaskstatus);

    int insertByCriteria(DbTaskstatus DbTaskstatus);

    int updateByCriteria(DbTaskstatus DbTaskstatus);

    DbTaskstatus selectByPrimaryKey(String sequenceid);

    List<DbTaskstatus> selectAll();
}