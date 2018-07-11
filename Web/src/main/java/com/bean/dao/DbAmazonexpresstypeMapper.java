package com.bean.dao;

import com.bean.model.DbAmazonexpresstype;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbAmazonexpresstypeMapper {
    DbAmazonexpresstype selectByCriteria(DbAmazonexpresstype DbAmazonexpresstype);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbAmazonexpresstype DbAmazonexpresstype);

    int insertByCriteria(DbAmazonexpresstype DbAmazonexpresstype);

    int updateByCriteria(DbAmazonexpresstype DbAmazonexpresstype);

    DbAmazonexpresstype selectByPrimaryKey(BigDecimal sid);

    List<DbAmazonexpresstype> selectAll();
}