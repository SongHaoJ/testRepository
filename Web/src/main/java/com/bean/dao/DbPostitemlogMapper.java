package com.bean.dao;

import com.bean.model.DbPostitemlog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbPostitemlogMapper {
    DbPostitemlog selectByCriteria(DbPostitemlog DbPostitemlog);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbPostitemlog DbPostitemlog);

    int insertByCriteria(DbPostitemlog DbPostitemlog);

    int updateByCriteria(DbPostitemlog DbPostitemlog);

    DbPostitemlog selectByPrimaryKey(String sid);

    List<DbPostitemlog> selectAll();
}