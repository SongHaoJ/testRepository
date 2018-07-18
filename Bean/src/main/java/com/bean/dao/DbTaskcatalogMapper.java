package com.bean.dao;

import com.bean.model.DbTaskcatalog;

import java.util.List;

public interface DbTaskcatalogMapper {
    List<DbTaskcatalog> selectAll();
}