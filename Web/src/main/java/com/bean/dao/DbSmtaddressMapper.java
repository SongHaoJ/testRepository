package com.bean.dao;

import com.bean.model.DbSmtaddress;
import java.util.List;
import org.springframework.stereotype.Service;

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