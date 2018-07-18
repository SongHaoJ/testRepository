package com.bean.dao;

import com.bean.model.DbPrintorderbyskuconfiginfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbPrintorderbyskuconfiginfoMapper {
    DbPrintorderbyskuconfiginfo selectByCriteria(DbPrintorderbyskuconfiginfo DbPrintorderbyskuconfiginfo);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbPrintorderbyskuconfiginfo DbPrintorderbyskuconfiginfo);

    int insertByCriteria(DbPrintorderbyskuconfiginfo DbPrintorderbyskuconfiginfo);

    int updateByCriteria(DbPrintorderbyskuconfiginfo DbPrintorderbyskuconfiginfo);

    DbPrintorderbyskuconfiginfo selectByPrimaryKey(String sid);

    List<DbPrintorderbyskuconfiginfo> selectAll();
}