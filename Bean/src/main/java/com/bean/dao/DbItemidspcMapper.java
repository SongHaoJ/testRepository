package com.bean.dao;

import com.bean.model.DbItemidspc;
import java.util.List;

public interface DbItemidspcMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_itemidspc
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_itemidspc
     *
     * @mbg.generated
     */
    int insert(DbItemidspc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_itemidspc
     *
     * @mbg.generated
     */
    DbItemidspc selectByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_itemidspc
     *
     * @mbg.generated
     */
    List<DbItemidspc> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_itemidspc
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbItemidspc record);
}