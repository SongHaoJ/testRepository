package com.bean.dao;

import com.bean.model.StatProductdetilDaily;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StatProductdetilDailyMapper {
    StatProductdetilDaily selectByCriteria(StatProductdetilDaily StatProductdetilDaily);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(StatProductdetilDaily StatProductdetilDaily);

    int insertByCriteria(StatProductdetilDaily StatProductdetilDaily);

    int updateByCriteria(StatProductdetilDaily StatProductdetilDaily);

    StatProductdetilDaily selectByPrimaryKey(String sequenceid);

    List<StatProductdetilDaily> selectAll();
}