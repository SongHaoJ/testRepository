package com.bean.dao;

import com.bean.model.DbPrinteubTemp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbPrinteubTempMapper {
    DbPrinteubTemp selectByCriteria(DbPrinteubTemp DbPrinteubTemp);

    void deleteByPrimaryKey(String SEQUENCEUID);

    void deleteByCriteria(DbPrinteubTemp DbPrinteubTemp);

    int insertByCriteria(DbPrinteubTemp DbPrinteubTemp);

    int updateByCriteria(DbPrinteubTemp DbPrinteubTemp);

    DbPrinteubTemp selectByPrimaryKey(String sequenceuid);

    List<DbPrinteubTemp> selectAll();
}