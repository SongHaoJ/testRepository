package com.bean.dao;

import com.bean.model.DbExpstore;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbExpstoreMapper {
    DbExpstore selectByCriteria(DbExpstore DbExpstore);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbExpstore DbExpstore);

    int insertByCriteria(DbExpstore DbExpstore);

    int updateByCriteria(DbExpstore DbExpstore);

    DbExpstore selectByPrimaryKey(BigDecimal sequenceid);

    List<DbExpstore> selectAll();
}