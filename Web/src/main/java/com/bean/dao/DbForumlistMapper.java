package com.bean.dao;

import com.bean.model.DbForumlist;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbForumlistMapper {
    DbForumlist selectByCriteria(DbForumlist DbForumlist);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbForumlist DbForumlist);

    int insertByCriteria(DbForumlist DbForumlist);

    int updateByCriteria(DbForumlist DbForumlist);

    DbForumlist selectByPrimaryKey(String sequenceid);

    List<DbForumlist> selectAll();
}