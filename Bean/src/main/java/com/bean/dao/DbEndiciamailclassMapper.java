package com.bean.dao;

import com.bean.model.DbEndiciamailclass;
import java.util.List;

public interface DbEndiciamailclassMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_endiciamailclass
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String class);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_endiciamailclass
     *
     * @mbg.generated
     */
    int insert(DbEndiciamailclass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_endiciamailclass
     *
     * @mbg.generated
     */
    List<DbEndiciamailclass> selectAll();
}