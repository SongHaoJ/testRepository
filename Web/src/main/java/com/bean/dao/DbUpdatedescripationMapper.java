package com.bean.dao;

import com.bean.model.DbUpdatedescripation;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbUpdatedescripationMapper {
    DbUpdatedescripation selectByCriteria(DbUpdatedescripation DbUpdatedescripation);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbUpdatedescripation DbUpdatedescripation);

    int insertByCriteria(DbUpdatedescripation DbUpdatedescripation);

    int updateByCriteria(DbUpdatedescripation DbUpdatedescripation);

    DbUpdatedescripation selectByPrimaryKey(BigDecimal sid);

    List<DbUpdatedescripation> selectAll();
}