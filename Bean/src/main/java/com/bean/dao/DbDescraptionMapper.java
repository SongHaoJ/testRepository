package com.bean.dao;

import com.bean.model.DbDescraption;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbDescraptionMapper {
    DbDescraption selectByCriteria(DbDescraption DbDescraption);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbDescraption DbDescraption);

    int insertByCriteria(DbDescraption DbDescraption);

    int updateByCriteria(DbDescraption DbDescraption);

    DbDescraption selectByPrimaryKey(BigDecimal sid);

    List<DbDescraption> selectAll();
}