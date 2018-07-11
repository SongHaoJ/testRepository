package com.bean.dao;

import com.bean.model.DbEbayapilog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbEbayapilogMapper {
    DbEbayapilog selectByCriteria(DbEbayapilog DbEbayapilog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbayapilog DbEbayapilog);

    int insertByCriteria(DbEbayapilog DbEbayapilog);

    int updateByCriteria(DbEbayapilog DbEbayapilog);

    DbEbayapilog selectByPrimaryKey(String sequenceid);

    List<DbEbayapilog> selectAll();
}