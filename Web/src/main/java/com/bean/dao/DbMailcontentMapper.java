package com.bean.dao;

import com.bean.model.DbMailcontent;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbMailcontentMapper {
    DbMailcontent selectByCriteria(DbMailcontent DbMailcontent);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbMailcontent DbMailcontent);

    int insertByCriteria(DbMailcontent DbMailcontent);

    int updateByCriteria(DbMailcontent DbMailcontent);

    DbMailcontent selectByPrimaryKey(String sequenceid);

    List<DbMailcontent> selectAll();
}