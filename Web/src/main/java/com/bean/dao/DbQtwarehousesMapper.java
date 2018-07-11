package com.bean.dao;

import com.bean.model.DbQtwarehouses;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbQtwarehousesMapper {
    DbQtwarehouses selectByCriteria(DbQtwarehouses DbQtwarehouses);

    void deleteByPrimaryKey(String WAREHOUSEID);

    void deleteByCriteria(DbQtwarehouses DbQtwarehouses);

    int insertByCriteria(DbQtwarehouses DbQtwarehouses);

    int updateByCriteria(DbQtwarehouses DbQtwarehouses);

    DbQtwarehouses selectByPrimaryKey(String warehouseid);

    List<DbQtwarehouses> selectAll();
}