package com.bean.dao;

import com.bean.model.DbAycountry;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbAycountryMapper {
    DbAycountry selectByCriteria(DbAycountry DbAycountry);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbAycountry DbAycountry);

    int insertByCriteria(DbAycountry DbAycountry);

    int updateByCriteria(DbAycountry DbAycountry);

    DbAycountry selectByPrimaryKey(Integer id);

    List<DbAycountry> selectAll();
}