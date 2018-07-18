package com.bean.dao;

import com.bean.model.DbVotoboaccount;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbVotoboaccountMapper {
    DbVotoboaccount selectByCriteria(DbVotoboaccount DbVotoboaccount);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbVotoboaccount DbVotoboaccount);

    int insertByCriteria(DbVotoboaccount DbVotoboaccount);

    int updateByCriteria(DbVotoboaccount DbVotoboaccount);

    DbVotoboaccount selectByPrimaryKey(String sid);

    List<DbVotoboaccount> selectAll();
}