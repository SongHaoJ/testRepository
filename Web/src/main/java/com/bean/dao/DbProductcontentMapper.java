package com.bean.dao;

import com.bean.model.DbProductcontent;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbProductcontentMapper {
    DbProductcontent selectByCriteria(DbProductcontent DbProductcontent);

    void deleteByPrimaryKey(String PRODUCTID);

    void deleteByCriteria(DbProductcontent DbProductcontent);

    int insertByCriteria(DbProductcontent DbProductcontent);

    int updateByCriteria(DbProductcontent DbProductcontent);

    DbProductcontent selectByPrimaryKey(String productid);

    List<DbProductcontent> selectAll();
}