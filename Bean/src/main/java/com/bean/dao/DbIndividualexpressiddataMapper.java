package com.bean.dao;

import com.bean.model.DbIndividualexpressiddata;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbIndividualexpressiddataMapper {
    DbIndividualexpressiddata selectByCriteria(DbIndividualexpressiddata DbIndividualexpressiddata);

    void deleteByPrimaryKey(String EXPRESSID);

    void deleteByCriteria(DbIndividualexpressiddata DbIndividualexpressiddata);

    int insertByCriteria(DbIndividualexpressiddata DbIndividualexpressiddata);

    int updateByCriteria(DbIndividualexpressiddata DbIndividualexpressiddata);

    DbIndividualexpressiddata selectByPrimaryKey(String expressid);

    List<DbIndividualexpressiddata> selectAll();
}