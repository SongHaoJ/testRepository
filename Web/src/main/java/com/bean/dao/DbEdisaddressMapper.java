package com.bean.dao;

import com.bean.model.DbEdisaddress;
import java.util.List;
import org.springframework.stereotype.Service;

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