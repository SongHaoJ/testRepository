package com.bean.dao;

import com.bean.model.DbUbicountry;
import org.springframework.stereotype.Service;

import java.util.List;

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