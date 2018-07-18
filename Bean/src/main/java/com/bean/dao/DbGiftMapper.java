package com.bean.dao;

import com.bean.model.DbGift;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbGiftMapper {
    DbGift selectByCriteria(DbGift DbGift);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbGift DbGift);

    int insertByCriteria(DbGift DbGift);

    int updateByCriteria(DbGift DbGift);

    DbGift selectByPrimaryKey(String sequenceid);

    List<DbGift> selectAll();
}