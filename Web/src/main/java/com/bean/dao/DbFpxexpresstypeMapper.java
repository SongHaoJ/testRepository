package com.bean.dao;

import com.bean.model.DbFpxexpresstype;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbFpxexpresstypeMapper {
    DbFpxexpresstype selectByCriteria(DbFpxexpresstype DbFpxexpresstype);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbFpxexpresstype DbFpxexpresstype);

    int insertByCriteria(DbFpxexpresstype DbFpxexpresstype);

    int updateByCriteria(DbFpxexpresstype DbFpxexpresstype);

    DbFpxexpresstype selectByPrimaryKey(String sid);

    List<DbFpxexpresstype> selectAll();
}