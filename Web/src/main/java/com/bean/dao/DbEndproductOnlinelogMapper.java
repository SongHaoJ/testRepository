package com.bean.dao;

import com.bean.model.DbEndproductOnlinelog;
import java.util.List;
import org.springframework.stereotype.Service;

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