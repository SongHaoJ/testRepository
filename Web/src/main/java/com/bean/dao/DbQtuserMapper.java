package com.bean.dao;

import com.bean.model.DbQtuser;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbQtuserMapper {
    DbQtuser selectByCriteria(DbQtuser DbQtuser);

    void deleteByPrimaryKey(String USERID);

    void deleteByCriteria(DbQtuser DbQtuser);

    int insertByCriteria(DbQtuser DbQtuser);

    int updateByCriteria(DbQtuser DbQtuser);

    DbQtuser selectByPrimaryKey(String userid);

    List<DbQtuser> selectAll();
}