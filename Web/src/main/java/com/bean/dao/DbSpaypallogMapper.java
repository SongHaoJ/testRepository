package com.bean.dao;

import com.bean.model.DbSpaypallog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbSpaypallogMapper {
    DbSpaypallog selectByCriteria(DbSpaypallog DbSpaypallog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbSpaypallog DbSpaypallog);

    int insertByCriteria(DbSpaypallog DbSpaypallog);

    int updateByCriteria(DbSpaypallog DbSpaypallog);

    DbSpaypallog selectByPrimaryKey(String sequenceid);

    List<DbSpaypallog> selectAll();
}