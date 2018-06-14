package com.service;

import com.bean.model.DbShop;
import com.bean.util.RetCode;

public interface LazadaService {

    /**
     * 查询需要跟新的Lazada产品
     *
     * @param shopid 店铺id
     * @return
     */
    RetCode findLazadanewproduct(String shopid);

    /**
     * 刷新令牌
     * @param dbShop
     * @return
     */
    RetCode getrefreshAccess_token(DbShop dbShop);

    /**
     * 查找需要下载的店铺
     *
     * @param shopId 店铺id
     * @return
     */
    RetCode findLazadaShopForDownload(String shopId);

    /**
     * 拉取物流信息
     * @param shop
     * @return
     */
    void GetShipmentProviders(DbShop shop);

    /**
     * 更新过期店铺状态
     * @param shopIdList
     */
    RetCode updateShopStatus(String shopIdList);

    /**
     * 下载某个店铺对应状态的订单
     * @param shop
     * @param status
     */
    void downloadLazadaOrderNew(DbShop shop,String status);

    /**
     * 计算缺货
     */
    void calcuOrder();
}
