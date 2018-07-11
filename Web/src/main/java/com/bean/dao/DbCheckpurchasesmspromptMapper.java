package com.bean.dao;

import com.bean.model.DbCheckpurchasesmsprompt;
import java.util.List;
import org.springframework.stereotype.Service;

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