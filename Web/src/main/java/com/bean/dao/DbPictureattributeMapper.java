package com.bean.dao;

import com.bean.model.DbPictureattribute;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbPictureattributeMapper {
    DbPictureattribute selectByCriteria(DbPictureattribute DbPictureattribute);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbPictureattribute DbPictureattribute);

    int insertByCriteria(DbPictureattribute DbPictureattribute);

    int updateByCriteria(DbPictureattribute DbPictureattribute);

    DbPictureattribute selectByPrimaryKey(String sequenceid);

    List<DbPictureattribute> selectAll();
}