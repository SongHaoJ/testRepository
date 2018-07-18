package com.bean.dao;

import com.bean.model.DbEndproductOnlinelog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEndproductOnlinelogMapper {
    DbEndproductOnlinelog selectByCriteria(DbEndproductOnlinelog DbEndproductOnlinelog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEndproductOnlinelog DbEndproductOnlinelog);

    int insertByCriteria(DbEndproductOnlinelog DbEndproductOnlinelog);

    int updateByCriteria(DbEndproductOnlinelog DbEndproductOnlinelog);

    DbEndproductOnlinelog selectByPrimaryKey(String sequenceid);

    List<DbEndproductOnlinelog> selectAll();
}