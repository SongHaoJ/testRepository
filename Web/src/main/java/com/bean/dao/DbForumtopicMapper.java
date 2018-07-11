package com.bean.dao;

import com.bean.model.DbForumtopic;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbForumtopicMapper {
    DbForumtopic selectByCriteria(DbForumtopic DbForumtopic);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbForumtopic DbForumtopic);

    int insertByCriteria(DbForumtopic DbForumtopic);

    int updateByCriteria(DbForumtopic DbForumtopic);

    DbForumtopic selectByPrimaryKey(String sequenceid);

    List<DbForumtopic> selectAll();
}