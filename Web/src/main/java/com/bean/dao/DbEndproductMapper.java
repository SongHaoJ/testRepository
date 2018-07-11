package com.bean.dao;

import com.bean.model.DbEndproduct;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbEndproductMapper {
    DbEndproduct selectByCriteria(DbEndproduct DbEndproduct);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbEndproduct DbEndproduct);

    int insertByCriteria(DbEndproduct DbEndproduct);

    int updateByCriteria(DbEndproduct DbEndproduct);

    DbEndproduct selectByPrimaryKey(BigDecimal sid);

    List<DbEndproduct> selectAll();
}