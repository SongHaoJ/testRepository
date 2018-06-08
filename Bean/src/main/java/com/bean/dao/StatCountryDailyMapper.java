package com.bean.dao;

import com.bean.model.StatCountryDaily;
import java.util.List;

public interface StatCountryDailyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stat_country_daily
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stat_country_daily
     *
     * @mbg.generated
     */
    int insert(StatCountryDaily record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stat_country_daily
     *
     * @mbg.generated
     */
    StatCountryDaily selectByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stat_country_daily
     *
     * @mbg.generated
     */
    List<StatCountryDaily> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stat_country_daily
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(StatCountryDaily record);
}