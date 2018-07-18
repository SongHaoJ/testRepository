package com.bean.dao;

import com.bean.model.DbStoragetask;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbStoragetaskMapper {
    DbStoragetask selectByCriteria(DbStoragetask DbStoragetask);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbStoragetask DbStoragetask);

    int insertByCriteria(DbStoragetask DbStoragetask);

    int updateByCriteria(DbStoragetask DbStoragetask);

    DbStoragetask selectByPrimaryKey(BigDecimal id);

    List<DbStoragetask> selectAll();
}