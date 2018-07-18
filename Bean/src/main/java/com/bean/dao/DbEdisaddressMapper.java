package com.bean.dao;

import com.bean.model.DbEdisaddress;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEdisaddressMapper {
    DbEdisaddress selectByCriteria(DbEdisaddress DbEdisaddress);

    void deleteByPrimaryKey(String ADDRESSID);

    void deleteByCriteria(DbEdisaddress DbEdisaddress);

    int insertByCriteria(DbEdisaddress DbEdisaddress);

    int updateByCriteria(DbEdisaddress DbEdisaddress);

    DbEdisaddress selectByPrimaryKey(String addressid);

    List<DbEdisaddress> selectAll();
}