package com.bean.dao;

import com.bean.model.DbEdispreference;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEdispreferenceMapper {
    DbEdispreference selectByCriteria(DbEdispreference DbEdispreference);

    void deleteByPrimaryKey(String CONSIGNPREFERENCEID);

    void deleteByCriteria(DbEdispreference DbEdispreference);

    int insertByCriteria(DbEdispreference DbEdispreference);

    int updateByCriteria(DbEdispreference DbEdispreference);

    DbEdispreference selectByPrimaryKey(String consignpreferenceid);

    List<DbEdispreference> selectAll();
}