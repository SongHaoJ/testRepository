package com.bean.dao;

import com.bean.model.StatProductShopDaily;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface StatProductShopDailyMapper {
    StatProductShopDaily selectByCriteria(StatProductShopDaily StatProductShopDaily);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(StatProductShopDaily StatProductShopDaily);

    int insertByCriteria(StatProductShopDaily StatProductShopDaily);

    int updateByCriteria(StatProductShopDaily StatProductShopDaily);

    StatProductShopDaily selectByPrimaryKey(String sequenceid);

    List<StatProductShopDaily> selectAll();
}