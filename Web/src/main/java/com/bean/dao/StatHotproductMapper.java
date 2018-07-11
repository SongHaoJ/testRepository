package com.bean.dao;

import com.bean.model.StatHotproduct;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface StatHotproductMapper {
    StatHotproduct selectByCriteria(StatHotproduct StatHotproduct);

    void deleteByPrimaryKey(String YYYYMMDD);

    void deleteByCriteria(StatHotproduct StatHotproduct);

    int insertByCriteria(StatHotproduct StatHotproduct);

    int updateByCriteria(StatHotproduct StatHotproduct);

    StatHotproduct selectByPrimaryKey(@Param("yyyymmdd") String yyyymmdd, @Param("shoptypeid") String shoptypeid, @Param("productid") String productid);

    List<StatHotproduct> selectAll();
}