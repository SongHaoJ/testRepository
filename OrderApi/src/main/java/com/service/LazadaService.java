package com.service;

import com.bean.model.DbLazadaorderinfo;
import com.bean.model.DbShop;
import com.bean.util.RetCode;

public interface LazadaService {



    void setManyStorageflag(boolean manyStorageflag);

    void setManyStorageSku(String manyStorageSku);




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
    String calcuOrder();
    /**
     * 订单存入临时表
     * @param recordId
     * @param obj
     * @param manyStorageflag
     * @param manyStorageSku
     * @param holdSpace
     * @param skuPosition
     * @param moneyrate
     * @param platformFeeRate
     * @return
     */
    RetCode saveOrderInfoFromLazadatemp(int recordId, DbLazadaorderinfo obj, boolean manyStorageflag,
                                               String manyStorageSku, boolean holdSpace, String skuPosition, double moneyrate, double platformFeeRate);


    /**
     * 查询临时表
     * @param obj
     * @return
     */
    RetCode findLazadaorderinfo(DbLazadaorderinfo obj);

    RetCode findManyStorageSkuFlag();

    void updateSell();
}
