package com.bean.dao;

import com.bean.model.DbConfigpicture;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbConfigpictureMapper {
    DbConfigpicture selectByCriteria(DbConfigpicture DbConfigpicture);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbConfigpicture DbConfigpicture);

    int insertByCriteria(DbConfigpicture DbConfigpicture);

    int updateByCriteria(DbConfigpicture DbConfigpicture);

    DbConfigpicture selectByPrimaryKey(BigDecimal sequenceid);

    List<DbConfigpicture> selectAll();
}