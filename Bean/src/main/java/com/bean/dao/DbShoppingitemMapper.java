package com.bean.dao;

import com.bean.model.DbShoppingitem;
import java.util.List;

public interface DbShoppingitemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shoppingitem
     *
     * @mbg.generated
     */
    int insert(DbShoppingitem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_shoppingitem
     *
     * @mbg.generated
     */
    List<DbShoppingitem> selectAll();
}