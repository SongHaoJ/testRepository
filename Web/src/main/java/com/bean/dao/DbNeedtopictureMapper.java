package com.bean.dao;

import com.bean.model.DbNeedtopicture;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbNeedtopictureMapper {
    DbNeedtopicture selectByCriteria(DbNeedtopicture DbNeedtopicture);

    void deleteByPrimaryKey(String ASIN);

    void deleteByCriteria(DbNeedtopicture DbNeedtopicture);

    int insertByCriteria(DbNeedtopicture DbNeedtopicture);

    int updateByCriteria(DbNeedtopicture DbNeedtopicture);

    DbNeedtopicture selectByPrimaryKey(String asin);

    List<DbNeedtopicture> selectAll();
}