package com.bean.dao;

import com.bean.model.DbCheckpurchasesmsprompt;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbCheckpurchasesmspromptMapper {
    DbCheckpurchasesmsprompt selectByCriteria(DbCheckpurchasesmsprompt DbCheckpurchasesmsprompt);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbCheckpurchasesmsprompt DbCheckpurchasesmsprompt);

    int insertByCriteria(DbCheckpurchasesmsprompt DbCheckpurchasesmsprompt);

    int updateByCriteria(DbCheckpurchasesmsprompt DbCheckpurchasesmsprompt);

    DbCheckpurchasesmsprompt selectByPrimaryKey(String sequenceid);

    List<DbCheckpurchasesmsprompt> selectAll();
}