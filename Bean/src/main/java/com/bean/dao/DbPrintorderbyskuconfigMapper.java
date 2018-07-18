package com.bean.dao;

import com.bean.model.DbPrintorderbyskuconfig;
import org.springframework.stereotype.Service;

import java.util.List;

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