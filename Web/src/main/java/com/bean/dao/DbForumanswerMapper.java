package com.bean.dao;

import com.bean.model.DbForumanswer;
import java.util.List;
import org.springframework.stereotype.Service;

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