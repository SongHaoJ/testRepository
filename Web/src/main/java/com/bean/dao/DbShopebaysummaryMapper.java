package com.bean.dao;

import com.bean.model.DbShopebaysummary;
import java.util.List;
import org.springframework.stereotype.Service;

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