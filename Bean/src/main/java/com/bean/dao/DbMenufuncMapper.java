package com.bean.dao;

import com.bean.model.DbMenufunc;
import java.util.List;

public interface DbMenufuncMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_menufunc
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String funid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_menufunc
     *
     * @mbg.generated
     */
    int insert(DbMenufunc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_menufunc
     *
     * @mbg.generated
     */
    DbMenufunc selectByPrimaryKey(String funid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_menufunc
     *
     * @mbg.generated
     */
    List<DbMenufunc> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_menufunc
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbMenufunc record);
}