package com.bean.dao;

import com.bean.model.DbExceptionproductlog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbExceptionproductlogMapper {
    DbExceptionproductlog selectByCriteria(DbExceptionproductlog DbExceptionproductlog);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbExceptionproductlog DbExceptionproductlog);

    int insertByCriteria(DbExceptionproductlog DbExceptionproductlog);

    int updateByCriteria(DbExceptionproductlog DbExceptionproductlog);

    DbExceptionproductlog selectByPrimaryKey(String id);

    List<DbExceptionproductlog> selectAll();
}