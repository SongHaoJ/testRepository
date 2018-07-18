package com.bean.dao;

import com.bean.model.DbOrdernum;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbOrdernumMapper {
    DbOrdernum selectByCriteria(DbOrdernum DbOrdernum);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbOrdernum DbOrdernum);

    int insertByCriteria(DbOrdernum DbOrdernum);

    int updateByCriteria(DbOrdernum DbOrdernum);

    DbOrdernum selectByPrimaryKey(Long id);

    List<DbOrdernum> selectAll();
}