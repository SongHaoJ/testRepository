package com.bean.dao;

import com.bean.model.DbProduct;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface DbProductMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbProduct record);

    int insertSelective(DbProduct record);

    DbProduct selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbProduct record);

    List<Map<String,String>> selectSidAndAliasBySid(List<String> skus);

    List<Map<String,String>> selectLocationIdAndStorageIdByOrderids(List<String> ids);
}
