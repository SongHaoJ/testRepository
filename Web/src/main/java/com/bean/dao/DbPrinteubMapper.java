package com.bean.dao;

import com.bean.model.DbPrinteub;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbPrinteubMapper {
    DbPrinteub selectByCriteria(DbPrinteub DbPrinteub);

    void deleteByPrimaryKey(String STATE);

    void deleteByCriteria(DbPrinteub DbPrinteub);

    int insertByCriteria(DbPrinteub DbPrinteub);

    int updateByCriteria(DbPrinteub DbPrinteub);

    DbPrinteub selectByPrimaryKey(String state);

    List<DbPrinteub> selectAll();
}