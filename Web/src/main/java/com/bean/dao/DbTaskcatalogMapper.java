package com.bean.dao;

import com.bean.model.DbTaskcatalog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbTaskcatalogMapper {
    DbTaskcatalog selectByCriteria(DbTaskcatalog DbTaskcatalog);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbTaskcatalog DbTaskcatalog);

    int insertByCriteria(DbTaskcatalog DbTaskcatalog);

    int updateByCriteria(DbTaskcatalog DbTaskcatalog);

    DbTaskcatalog selectByPrimaryKey(String sid);

    List<DbTaskcatalog> selectAll();
}