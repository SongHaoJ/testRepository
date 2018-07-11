package com.bean.dao;

import com.bean.model.DbBirdseller;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbBirdsellerMapper {
    DbBirdseller selectByCriteria(DbBirdseller DbBirdseller);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbBirdseller DbBirdseller);

    int insertByCriteria(DbBirdseller DbBirdseller);

    int updateByCriteria(DbBirdseller DbBirdseller);

    DbBirdseller selectByPrimaryKey(String sid);

    List<DbBirdseller> selectAll();
}