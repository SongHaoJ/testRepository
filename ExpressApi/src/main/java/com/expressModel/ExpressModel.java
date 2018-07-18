package com.expressModel;

import com.bean.util.RetCode;
import com.gourpBean.ExpressInfo;
import com.gourpBean.OrderInfo;

import java.math.BigDecimal;
import java.util.List;

public interface ExpressModel {
    /**
     * 查询或插入物流方式
     * @return
     */
    int selectOrInsertExpress();

    /**
     * 查询物流方式配置
     * @param ordertype
     * @return
     */
    RetCode findexpressconfig(String ordertype);

    /**
     * 查询物流方式详情
     * @param expresstypeid
     * @return
     */
    RetCode findExpresstype(String expresstypeid);

    /**
     * 查询交运的订单物流信息
     * @param ordertype
     * @param errflag
     * @return
     */
    List<ExpressInfo> selectExpressInfo(String ordertype, BigDecimal errflag);

    /**
     * 查询交运的订单商品详情信息
     * @param orderid
     * @return
     */
    OrderInfo selectOrderInfo(String orderid);

}
