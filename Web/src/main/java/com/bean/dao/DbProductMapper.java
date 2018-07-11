package com.bean.dao;

import com.bean.model.DbProduct;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbProductMapper {
    DbProduct selectByCriteria(DbProduct DbProduct);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProduct DbProduct);

    int insertByCriteria(DbProduct DbProduct);

    int updateByCriteria(DbProduct DbProduct);

    DbProduct selectByPrimaryKey(String sequenceid);

    List<DbProduct> selectAll();
}