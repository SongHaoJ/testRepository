package com.bean.dao;

import com.bean.model.DbMuliproduct;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbMuliproductMapper {
    DbMuliproduct selectByCriteria(DbMuliproduct DbMuliproduct);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbMuliproduct DbMuliproduct);

    int insertByCriteria(DbMuliproduct DbMuliproduct);

    int updateByCriteria(DbMuliproduct DbMuliproduct);

    DbMuliproduct selectByPrimaryKey(Integer id);

    List<DbMuliproduct> selectAll();
}