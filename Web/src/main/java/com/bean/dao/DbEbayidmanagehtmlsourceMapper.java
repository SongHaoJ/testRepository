package com.bean.dao;

import com.bean.model.DbEbayidmanagehtmlsource;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbEbayidmanagehtmlsourceMapper {
    DbEbayidmanagehtmlsource selectByCriteria(DbEbayidmanagehtmlsource DbEbayidmanagehtmlsource);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbayidmanagehtmlsource DbEbayidmanagehtmlsource);

    int insertByCriteria(DbEbayidmanagehtmlsource DbEbayidmanagehtmlsource);

    int updateByCriteria(DbEbayidmanagehtmlsource DbEbayidmanagehtmlsource);

    DbEbayidmanagehtmlsource selectByPrimaryKey(BigDecimal sequenceid);

    List<DbEbayidmanagehtmlsource> selectAll();
}