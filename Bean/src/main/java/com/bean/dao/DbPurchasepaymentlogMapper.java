package com.bean.dao;

import com.bean.model.DbPurchasepaymentlog;
import java.util.List;

public interface DbPurchasepaymentlogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_purchasepaymentlog
     *
     * @mbg.generated
     */
    int insert(DbPurchasepaymentlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_purchasepaymentlog
     *
     * @mbg.generated
     */
    List<DbPurchasepaymentlog> selectAll();
}