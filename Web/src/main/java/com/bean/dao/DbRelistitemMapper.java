package com.bean.dao;

import com.bean.model.DbRelistitem;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbRelistitemMapper {
    DbRelistitem selectByCriteria(DbRelistitem DbRelistitem);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbRelistitem DbRelistitem);

    int insertByCriteria(DbRelistitem DbRelistitem);

    int updateByCriteria(DbRelistitem DbRelistitem);

    DbRelistitem selectByPrimaryKey(BigDecimal sid);

    List<DbRelistitem> selectAll();
}