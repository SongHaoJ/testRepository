package com.serviceImpl;

import com.bean.model.DbExpressapiuser;
import com.expressModel.ExpressModelImpl;
import com.service.EdisEbayService;
import org.springframework.stereotype.Service;

@Service

public class EdisEbayServiceImpl extends ExpressModelImpl implements EdisEbayService {

    @Override
    public int getChannel() {
        return 0;
    }

    @Override
    public String getFetchToken(DbExpressapiuser apiUser) {
        return null;
    }

    @Override
    public void createOrder(int recordnum) {

    }

    @Override
    public int selectOrInsertExpress() {
        return 0;
    }
}
