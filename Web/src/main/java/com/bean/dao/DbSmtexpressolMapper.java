package com.bean.dao;

import com.bean.model.DbSmtexpressol;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbSmtexpressolMapper {
    DbSmtexpressol selectByCriteria(DbSmtexpressol DbSmtexpressol);

    void deleteByPrimaryKey(String CODE);

    void deleteByCriteria(DbSmtexpressol DbSmtexpressol);

    int insertByCriteria(DbSmtexpressol DbSmtexpressol);

    int updateByCriteria(DbSmtexpressol DbSmtexpressol);

    DbSmtexpressol selectByPrimaryKey(String code);

    List<DbSmtexpressol> selectAll();
}