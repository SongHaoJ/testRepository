package com.bean.dao;

import com.bean.model.DbCkycountry;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbCkycountryMapper {
    DbCkycountry selectByCriteria(DbCkycountry DbCkycountry);

    void deleteByPrimaryKey(String NAMECN);

    void deleteByCriteria(DbCkycountry DbCkycountry);

    int insertByCriteria(DbCkycountry DbCkycountry);

    int updateByCriteria(DbCkycountry DbCkycountry);

    DbCkycountry selectByPrimaryKey(String namecn);

    List<DbCkycountry> selectAll();
}