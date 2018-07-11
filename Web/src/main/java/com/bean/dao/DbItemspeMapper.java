package com.bean.dao;

import com.bean.model.DbItemspe;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbItemspeMapper {
    DbItemspe selectByCriteria(DbItemspe DbItemspe);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbItemspe DbItemspe);

    int insertByCriteria(DbItemspe DbItemspe);

    int updateByCriteria(DbItemspe DbItemspe);

    DbItemspe selectByPrimaryKey(String sid);

    List<DbItemspe> selectAll();
}