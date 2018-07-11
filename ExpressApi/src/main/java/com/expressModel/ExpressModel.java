package com.expressModel;

import com.bean.util.RetCode;
import com.gourpBean.ExpressInfo;
import com.gourpBean.OrderInfo;

import java.math.BigDecimal;

public interface ExpressModel {

    RetCode findexpressconfig(String ordertype);

    RetCode findExpresstype(String expresstypeid);

    ExpressInfo selectExpressInfo(String ordertype, BigDecimal errflag);

    OrderInfo selectOrderInfo(String orderid);

}
