package com.bean.dao;

import com.bean.model.DbProductebayfee;
import java.math.BigDecimal;
import java.util.List;

public interface DbProductebayfeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_productebayfee
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(BigDecimal sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_productebayfee
     *
     * @mbg.generated
     */
    int insert(DbProductebayfee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_productebayfee
     *
     * @mbg.generated
     */
    DbProductebayfee selectByPrimaryKey(BigDecimal sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_productebayfee
     *
     * @mbg.generated
     */
    List<DbProductebayfee> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_productebayfee
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbProductebayfee record);
}