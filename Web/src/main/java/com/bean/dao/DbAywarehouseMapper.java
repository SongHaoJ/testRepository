package com.bean.dao;

import com.bean.model.DbAywarehouse;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbAywarehouseMapper {
    DbAywarehouse selectByCriteria(DbAywarehouse DbAywarehouse);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbAywarehouse DbAywarehouse);

    int insertByCriteria(DbAywarehouse DbAywarehouse);

    int updateByCriteria(DbAywarehouse DbAywarehouse);

    DbAywarehouse selectByPrimaryKey(Long id);

    List<DbAywarehouse> selectAll();
}