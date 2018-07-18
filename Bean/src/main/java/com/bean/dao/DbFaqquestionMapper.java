package com.bean.dao;

import com.bean.model.DbFaqquestion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbFaqquestionMapper {
    DbFaqquestion selectByCriteria(DbFaqquestion DbFaqquestion);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbFaqquestion DbFaqquestion);

    int insertByCriteria(DbFaqquestion DbFaqquestion);

    int updateByCriteria(DbFaqquestion DbFaqquestion);

    DbFaqquestion selectByPrimaryKey(Integer sequenceid);

    List<DbFaqquestion> selectAll();
}