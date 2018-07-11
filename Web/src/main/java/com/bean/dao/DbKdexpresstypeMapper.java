package com.bean.dao;

import com.bean.model.DbKdexpresstype;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbKdexpresstypeMapper {
    DbKdexpresstype selectByCriteria(DbKdexpresstype DbKdexpresstype);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbKdexpresstype DbKdexpresstype);

    int insertByCriteria(DbKdexpresstype DbKdexpresstype);

    int updateByCriteria(DbKdexpresstype DbKdexpresstype);

    DbKdexpresstype selectByPrimaryKey(String sid);

    List<DbKdexpresstype> selectAll();
}