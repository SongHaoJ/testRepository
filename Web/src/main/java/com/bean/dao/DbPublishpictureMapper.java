package com.bean.dao;

import com.bean.model.DbPublishpicture;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbPublishpictureMapper {
    DbPublishpicture selectByCriteria(DbPublishpicture DbPublishpicture);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbPublishpicture DbPublishpicture);

    int insertByCriteria(DbPublishpicture DbPublishpicture);

    int updateByCriteria(DbPublishpicture DbPublishpicture);

    DbPublishpicture selectByPrimaryKey(String sequenceid);

    List<DbPublishpicture> selectAll();
}