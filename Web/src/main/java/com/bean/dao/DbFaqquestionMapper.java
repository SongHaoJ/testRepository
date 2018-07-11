package com.bean.dao;

import com.bean.model.DbFaqquestion;
import java.util.List;
import org.springframework.stereotype.Service;

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