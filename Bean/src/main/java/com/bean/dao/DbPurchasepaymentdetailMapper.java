package com.bean.dao;

import com.bean.model.DbPurchasepaymentdetail;
import java.util.List;

public interface DbPurchasepaymentdetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_purchasepaymentdetail
     *
     * @mbg.generated
     */
    int insert(DbPurchasepaymentdetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_purchasepaymentdetail
     *
     * @mbg.generated
     */
    List<DbPurchasepaymentdetail> selectAll();
}