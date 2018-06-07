package com.bean.dao;

import com.bean.model.DbCaiwu;
import java.util.List;

public interface DbCaiwuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_caiwu
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_caiwu
     *
     * @mbg.generated
     */
    int insert(DbCaiwu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_caiwu
     *
     * @mbg.generated
     */
    DbCaiwu selectByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_caiwu
     *
     * @mbg.generated
     */
    List<DbCaiwu> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_caiwu
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbCaiwu record);
}