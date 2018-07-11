package com.bean.dao;

import com.bean.model.DbPrintorderbyskuconfig;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbPrintorderbyskuconfigMapper {
    DbPrintorderbyskuconfig selectByCriteria(DbPrintorderbyskuconfig DbPrintorderbyskuconfig);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbPrintorderbyskuconfig DbPrintorderbyskuconfig);

    int insertByCriteria(DbPrintorderbyskuconfig DbPrintorderbyskuconfig);

    int updateByCriteria(DbPrintorderbyskuconfig DbPrintorderbyskuconfig);

    DbPrintorderbyskuconfig selectByPrimaryKey(String sid);

    List<DbPrintorderbyskuconfig> selectAll();
}