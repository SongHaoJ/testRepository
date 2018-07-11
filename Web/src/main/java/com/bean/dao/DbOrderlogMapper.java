package com.bean.dao;

import com.bean.model.DbOrderlog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbOrderlogMapper {
    DbOrderlog selectByCriteria(DbOrderlog DbOrderlog);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbOrderlog DbOrderlog);

    int insertByCriteria(DbOrderlog DbOrderlog);

    int updateByCriteria(DbOrderlog DbOrderlog);

    DbOrderlog selectByPrimaryKey(String sid);

    List<DbOrderlog> selectAll();
}