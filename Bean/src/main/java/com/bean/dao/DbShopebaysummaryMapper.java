package com.bean.dao;

import com.bean.model.DbShopebaysummary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbShopebaysummaryMapper {
    DbShopebaysummary selectByCriteria(DbShopebaysummary DbShopebaysummary);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbShopebaysummary DbShopebaysummary);

    int insertByCriteria(DbShopebaysummary DbShopebaysummary);

    int updateByCriteria(DbShopebaysummary DbShopebaysummary);

    DbShopebaysummary selectByPrimaryKey(String sid);

    List<DbShopebaysummary> selectAll();
}