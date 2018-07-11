package com.bean.dao;

import com.bean.model.Shop;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ShopMapper {
    Shop selectByCriteria(Shop Shop);

    void deleteByPrimaryKey(String sid);

    void deleteByCriteria(Shop Shop);

    int insertByCriteria(Shop Shop);

    int updateByCriteria(Shop Shop);

    Shop selectByPrimaryKey(Integer sid);

    List<Shop> selectAll();
}