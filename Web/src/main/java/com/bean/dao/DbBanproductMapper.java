package com.bean.dao;

import com.bean.model.DbBanproduct;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbBanproductMapper {
    DbBanproduct selectByCriteria(DbBanproduct DbBanproduct);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbBanproduct DbBanproduct);

    int insertByCriteria(DbBanproduct DbBanproduct);

    int updateByCriteria(DbBanproduct DbBanproduct);

    DbBanproduct selectByPrimaryKey(String sid);

    List<DbBanproduct> selectAll();
}