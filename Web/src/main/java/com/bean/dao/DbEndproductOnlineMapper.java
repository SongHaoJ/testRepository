package com.bean.dao;

import com.bean.model.DbEndproductOnline;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbEndproductOnlineMapper {
    DbEndproductOnline selectByCriteria(DbEndproductOnline DbEndproductOnline);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEndproductOnline DbEndproductOnline);

    int insertByCriteria(DbEndproductOnline DbEndproductOnline);

    int updateByCriteria(DbEndproductOnline DbEndproductOnline);

    DbEndproductOnline selectByPrimaryKey(String sequenceid);

    List<DbEndproductOnline> selectAll();
}