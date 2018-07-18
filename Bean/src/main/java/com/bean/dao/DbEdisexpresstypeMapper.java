package com.bean.dao;

import com.bean.model.DbEdisexpresstype;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEdisexpresstypeMapper {
    DbEdisexpresstype selectByCriteria(DbEdisexpresstype DbEdisexpresstype);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbEdisexpresstype DbEdisexpresstype);

    int insertByCriteria(DbEdisexpresstype DbEdisexpresstype);

    int updateByCriteria(DbEdisexpresstype DbEdisexpresstype);

    DbEdisexpresstype selectByPrimaryKey(String sid);

    List<DbEdisexpresstype> selectAll();
}