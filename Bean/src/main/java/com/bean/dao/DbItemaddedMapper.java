package com.bean.dao;

import com.bean.model.DbItemadded;
import java.util.List;

public interface DbItemaddedMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_itemadded
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String itemid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_itemadded
     *
     * @mbg.generated
     */
    int insert(DbItemadded record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_itemadded
     *
     * @mbg.generated
     */
    List<DbItemadded> selectAll();
}