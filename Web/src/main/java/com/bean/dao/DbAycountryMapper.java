package com.bean.dao;

import com.bean.model.DbAycountry;
import java.util.List;
import org.springframework.stereotype.Service;

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