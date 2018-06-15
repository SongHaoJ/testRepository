package com.bean.dao;

import com.bean.model.DbSell;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface DbSellMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbSell record);

    int insertSelective(DbSell record);

    DbSell selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbSell record);

    List<Map<String,String>> selectSumOrderNumByGroup(@Param("groupid")Long groupid,@Param("flagList")List<String> flagList);

    List<Map<String,String>> calculateorder(@Param("groupid")Long groupid);

}