package com.bean.dao;

import com.bean.model.DbWishexpresstype;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbWishexpresstypeMapper {
    DbWishexpresstype selectByCriteria(DbWishexpresstype DbWishexpresstype);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbWishexpresstype DbWishexpresstype);

    int insertByCriteria(DbWishexpresstype DbWishexpresstype);

    int updateByCriteria(DbWishexpresstype DbWishexpresstype);

    DbWishexpresstype selectByPrimaryKey(Short sid);

    List<DbWishexpresstype> selectAll();
}