package com.bean.dao;

import com.bean.model.DbPaypal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbPaypalMapper {
    DbPaypal selectByCriteria(DbPaypal DbPaypal);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbPaypal DbPaypal);

    int insertByCriteria(DbPaypal DbPaypal);

    int updateByCriteria(DbPaypal DbPaypal);

    DbPaypal selectByPrimaryKey(String sequenceid);

    List<DbPaypal> selectAll();
}