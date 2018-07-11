package com.bean.dao;

import com.bean.model.StatHotshopDaily;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface StatHotshopDailyMapper {
    StatHotshopDaily selectByCriteria(StatHotshopDaily StatHotshopDaily);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(StatHotshopDaily StatHotshopDaily);

    int insertByCriteria(StatHotshopDaily StatHotshopDaily);

    int updateByCriteria(StatHotshopDaily StatHotshopDaily);

    StatHotshopDaily selectByPrimaryKey(String sequenceid);

    List<StatHotshopDaily> selectAll();
}