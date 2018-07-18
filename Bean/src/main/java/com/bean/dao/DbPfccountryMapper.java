package com.bean.dao;

import com.bean.model.DbPfccountry;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbPfccountryMapper {
    DbPfccountry selectByCriteria(DbPfccountry DbPfccountry);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbPfccountry DbPfccountry);

    int insertByCriteria(DbPfccountry DbPfccountry);

    int updateByCriteria(DbPfccountry DbPfccountry);

    DbPfccountry selectByPrimaryKey(Integer id);

    List<DbPfccountry> selectAll();
}