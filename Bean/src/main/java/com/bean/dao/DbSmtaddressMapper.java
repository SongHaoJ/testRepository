package com.bean.dao;

import com.bean.model.DbSmtaddress;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbSmtaddressMapper {
    DbSmtaddress selectByCriteria(DbSmtaddress DbSmtaddress);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbSmtaddress DbSmtaddress);

    int insertByCriteria(DbSmtaddress DbSmtaddress);

    int updateByCriteria(DbSmtaddress DbSmtaddress);

    DbSmtaddress selectByPrimaryKey(Long id);

    List<DbSmtaddress> selectAll();
}