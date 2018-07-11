package com.bean.dao;

import com.bean.model.DbProjectproduct;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbProjectproductMapper {
    DbProjectproduct selectByCriteria(DbProjectproduct DbProjectproduct);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbProjectproduct DbProjectproduct);

    int insertByCriteria(DbProjectproduct DbProjectproduct);

    int updateByCriteria(DbProjectproduct DbProjectproduct);

    DbProjectproduct selectByPrimaryKey(String sid);

    List<DbProjectproduct> selectAll();
}