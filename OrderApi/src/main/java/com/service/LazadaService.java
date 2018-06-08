package com.service;

import com.bean.model.DbLazadaorderinfo;
import com.bean.model.DbMoneyrate;
import com.bean.model.DbProduct;
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
     * 查找lazada店铺
     *
     * @param shopId 店铺id
     * @return
     */
    RetCode findLazadaShopForDownload(String shopId);

    /**
     * 计算订单金额
     *
     * @param groupid
     */
    void updateCalculateNew(long groupid);

    /**
     * 保存order订单基本信息
     *
     * @param obj
     * @param skuPosition
     * @param moneyrate
     * @param platformFeeRate
     */
    void saveOrder(DbLazadaorderinfo obj, String skuPosition, double moneyrate, double platformFeeRate);

    /**
     * 执行数据清理（整理数据库，效率慢）
     *
     * @return
     */
    RetCode updateMabangData();

    /**
     * 同步包材重量
     *
     * @return
     */
    RetCode updatePackagingWeight();

    /**
     * 同步sell中商品重量
     *
     * @return
     */
    RetCode updateCalcuSellWeight();

    /**
     * 计算出最佳包材及重量
     *
     * @return
     */
    RetCode updateCalcuOrderPackageWeight();

    /**
     * 计算整个订单包裹重量（订单包裹的重量=订单的各种商品重量之和+包材的重量）
     *
     * @return
     */
    RetCode updateCalcuOrderWeight();

    /**
     * 查找sell表中需要计算能否发货的商品
     *
     * @return
     */
    RetCode findProductForAlertflag();

    /**
     * 计算sell表中包含对应商品的订单能否发货
     *
     * @param obj
     * @return
     */
    RetCode updateCalcuSellAlertflag(DbProduct obj);

    /**
     * 获取汇率
     *
     * @param obj
     * @return
     */
    RetCode findMoneyrate(DbMoneyrate obj);

    /**
     * 保存新币种
     *
     * @param currencyId
     * @param moneyrate
     */
    void saveMoneyrate(String currencyId, double moneyrate);

    /**
     * 查询需要分配paypalfee的订单(入参,订单数量或要单独计算的orderid)
     * @param rownumber
     * @param orderid
     * @return
     */
    RetCode updateSplitPaypalFee(int rownumber, String orderid);
}
