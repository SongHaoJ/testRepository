package com.bean.dao;

import com.bean.model.DbNotonlineproduct;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbNotonlineproductMapper {
    DbNotonlineproduct selectByCriteria(DbNotonlineproduct DbNotonlineproduct);

    void deleteByPrimaryKey(String ITEMID);

    void deleteByCriteria(DbNotonlineproduct DbNotonlineproduct);

    int insertByCriteria(DbNotonlineproduct DbNotonlineproduct);

    int updateByCriteria(DbNotonlineproduct DbNotonlineproduct);

    DbNotonlineproduct selectByPrimaryKey(String itemid);

    List<DbNotonlineproduct> selectAll();
}