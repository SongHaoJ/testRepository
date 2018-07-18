package com.bean.dao;

import com.bean.model.DbForumanswer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbForumanswerMapper {
    DbForumanswer selectByCriteria(DbForumanswer DbForumanswer);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbForumanswer DbForumanswer);

    int insertByCriteria(DbForumanswer DbForumanswer);

    int updateByCriteria(DbForumanswer DbForumanswer);

    DbForumanswer selectByPrimaryKey(String sequenceid);

    List<DbForumanswer> selectAll();
}