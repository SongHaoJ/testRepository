package com.bean.dao;

import com.bean.model.DbTwodevelopmentlist;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbTwodevelopmentlistMapper {
    DbTwodevelopmentlist selectByCriteria(DbTwodevelopmentlist DbTwodevelopmentlist);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbTwodevelopmentlist DbTwodevelopmentlist);

    int insertByCriteria(DbTwodevelopmentlist DbTwodevelopmentlist);

    int updateByCriteria(DbTwodevelopmentlist DbTwodevelopmentlist);

    DbTwodevelopmentlist selectByPrimaryKey(String sid);

    List<DbTwodevelopmentlist> selectAll();
}