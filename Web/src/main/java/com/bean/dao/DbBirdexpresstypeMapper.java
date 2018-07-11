package com.bean.dao;

import com.bean.model.DbBirdexpresstype;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbBirdexpresstypeMapper {
    DbBirdexpresstype selectByCriteria(DbBirdexpresstype DbBirdexpresstype);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbBirdexpresstype DbBirdexpresstype);

    int insertByCriteria(DbBirdexpresstype DbBirdexpresstype);

    int updateByCriteria(DbBirdexpresstype DbBirdexpresstype);

    DbBirdexpresstype selectByPrimaryKey(String sid);

    List<DbBirdexpresstype> selectAll();
}