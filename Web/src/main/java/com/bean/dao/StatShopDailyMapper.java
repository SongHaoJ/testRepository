package com.bean.dao;

import com.bean.model.StatShopDaily;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface StatShopDailyMapper {
    StatShopDaily selectByCriteria(StatShopDaily StatShopDaily);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(StatShopDaily StatShopDaily);

    int insertByCriteria(StatShopDaily StatShopDaily);

    int updateByCriteria(StatShopDaily StatShopDaily);

    StatShopDaily selectByPrimaryKey(String sequenceid);

    List<StatShopDaily> selectAll();
}