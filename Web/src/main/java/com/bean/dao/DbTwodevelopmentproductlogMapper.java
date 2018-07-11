package com.bean.dao;

import com.bean.model.DbTwodevelopmentproductlog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbTwodevelopmentproductlogMapper {
    DbTwodevelopmentproductlog selectByCriteria(DbTwodevelopmentproductlog DbTwodevelopmentproductlog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbTwodevelopmentproductlog DbTwodevelopmentproductlog);

    int insertByCriteria(DbTwodevelopmentproductlog DbTwodevelopmentproductlog);

    int updateByCriteria(DbTwodevelopmentproductlog DbTwodevelopmentproductlog);

    DbTwodevelopmentproductlog selectByPrimaryKey(String sequenceid);

    List<DbTwodevelopmentproductlog> selectAll();
}