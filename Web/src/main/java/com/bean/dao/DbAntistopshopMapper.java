package com.bean.dao;

import com.bean.model.DbAntistopshop;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbAntistopshopMapper {
    DbAntistopshop selectByCriteria(DbAntistopshop DbAntistopshop);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbAntistopshop DbAntistopshop);

    int insertByCriteria(DbAntistopshop DbAntistopshop);

    int updateByCriteria(DbAntistopshop DbAntistopshop);

    DbAntistopshop selectByPrimaryKey(BigDecimal sequenceid);

    List<DbAntistopshop> selectAll();
}