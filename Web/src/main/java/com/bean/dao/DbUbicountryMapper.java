package com.bean.dao;

import com.bean.model.DbUbicountry;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbUbicountryMapper {
    DbUbicountry selectByCriteria(DbUbicountry DbUbicountry);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbUbicountry DbUbicountry);

    int insertByCriteria(DbUbicountry DbUbicountry);

    int updateByCriteria(DbUbicountry DbUbicountry);

    DbUbicountry selectByPrimaryKey(String id);

    List<DbUbicountry> selectAll();
}