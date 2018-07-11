package com.bean.dao;

import com.bean.model.DbYwuser;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbYwuserMapper {
    DbYwuser selectByCriteria(DbYwuser DbYwuser);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbYwuser DbYwuser);

    int insertByCriteria(DbYwuser DbYwuser);

    int updateByCriteria(DbYwuser DbYwuser);

    DbYwuser selectByPrimaryKey(String sid);

    List<DbYwuser> selectAll();
}