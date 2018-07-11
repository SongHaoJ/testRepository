package com.bean.dao;

import com.bean.model.DbItemlisting;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbItemlistingMapper {
    DbItemlisting selectByCriteria(DbItemlisting DbItemlisting);

    void deleteByPrimaryKey(String ITEMID);

    void deleteByCriteria(DbItemlisting DbItemlisting);

    int insertByCriteria(DbItemlisting DbItemlisting);

    int updateByCriteria(DbItemlisting DbItemlisting);

    DbItemlisting selectByPrimaryKey(String itemid);

    List<DbItemlisting> selectAll();
}