package com.bean.dao;

import com.bean.model.DbSpecialservicecode;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbSpecialservicecodeMapper {
    DbSpecialservicecode selectByCriteria(DbSpecialservicecode DbSpecialservicecode);

    void deleteByPrimaryKey(String SERVICECODE);

    void deleteByCriteria(DbSpecialservicecode DbSpecialservicecode);

    int insertByCriteria(DbSpecialservicecode DbSpecialservicecode);

    int updateByCriteria(DbSpecialservicecode DbSpecialservicecode);

    DbSpecialservicecode selectByPrimaryKey(String servicecode);

    List<DbSpecialservicecode> selectAll();
}