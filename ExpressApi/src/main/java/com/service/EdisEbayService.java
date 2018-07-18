package com.service;

import com.bean.model.DbExpressapiuser;
import com.expressModel.ExpressModel;

public interface EdisEbayService extends ExpressModel {

    /**
     * 更新物流
     * @return
     */
    int getChannel();

    String getFetchToken(DbExpressapiuser apiUser);

    void createOrder(int recordnum);

}
