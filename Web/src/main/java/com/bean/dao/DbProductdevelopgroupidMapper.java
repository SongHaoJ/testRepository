package com.bean.dao;

import com.bean.model.DbProductdevelopgroupid;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbProductdevelopgroupidMapper {
    DbProductdevelopgroupid selectByCriteria(DbProductdevelopgroupid DbProductdevelopgroupid);

    void deleteByPrimaryKey(String GROUPID);

    void deleteByCriteria(DbProductdevelopgroupid DbProductdevelopgroupid);

    int insertByCriteria(DbProductdevelopgroupid DbProductdevelopgroupid);

    int updateByCriteria(DbProductdevelopgroupid DbProductdevelopgroupid);

    DbProductdevelopgroupid selectByPrimaryKey(String groupid);

    List<DbProductdevelopgroupid> selectAll();
}