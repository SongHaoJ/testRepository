package com.orderThread;

import com.Service.LazadaService;
import com.bean.model.DbShop;
import com.bean.util.RetCode;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

import static java.lang.Thread.sleep;


public class LazadaOrderThread implements Runnable {

    private Boolean freshShop = true;

    @Autowired
    private LazadaService service;

    public void setFreshShop(Boolean freshShop) {
        this.freshShop = freshShop;
    }


    @Override
    public void run() {

        while(freshShop){
            RetCode rt = service.findLazadaShopForDownload(null);

            if (rt.getObj() != null) {
                // 遍历
                ArrayList<DbShop> list = (ArrayList<DbShop>) rt.getObj();
                int i = 0;
                String shopName = "";
                for (DbShop o : list) {
                    try {
                        // 下载某个店铺认可物流方式

                        RetCode rc = service.getrefreshAccess_token(o);
                        if (rc.getCode() == 999) {
                            shopName += "'" + o.getName() + "',";
                        } else {
                         /*   this.GetShipmentProviders(o);*/
                        }

                        i++;
                        // 获取完一个店铺休眠3秒,继续下一店铺
                        sleep(3000);
                    } catch (Exception e) {
                    }
                }
                if (shopName.length() > 0) {
                    if (shopName.endsWith(",")) {
                        shopName = shopName.substring(0, shopName.length() - 1);
                    }


                }
            } else {

            }





        }
    }
}
