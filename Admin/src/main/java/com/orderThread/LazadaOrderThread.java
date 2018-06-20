package com.orderThread;

import com.bean.util.Sys;
import com.bean.yml.LazadaYml;
import com.service.LazadaService;
import com.bean.model.DbShop;
import com.bean.util.RetCode;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

import static java.lang.Thread.sleep;


public class LazadaOrderThread implements Runnable {

    private Boolean freshShop = true;
    private int calcuOrderDiff = 4;//计算缺货计间隔
    private int calcuCount= 0;//计算缺货计数器


/*    private static List<Map<String,String>> skuMap;//多仓sku暂存
    private static boolean refreshSku;//多仓sku刷新标志*/
    @Autowired
    private LazadaService service;

/*
    public static List<Map<String, String>> getSkuMap() {
        return skuMap;
    }

    public static void setRefreshSku(boolean refreshSku) {
        LazadaOrderThread.refreshSku = refreshSku;
    }
*/

    public void setFreshShop(Boolean freshShop) {
        this.freshShop = freshShop;
    }


    @Override
    public void run() {

        while(freshShop) {

            RetCode rt = service.findLazadaShopForDownload(null);

            if (rt.getObj() != null) {
                // 遍历
                ArrayList<DbShop> list = (ArrayList<DbShop>) rt.getObj();
                /*int i = 0;*/
                String shopIds = "";
                for (DbShop o : list) {
                    try {
                        // 下载某个店铺认可物流方式

                        RetCode rc = service.getrefreshAccess_token(o);
                        if (rc.getCode() == 999) {
                            shopIds+="'" + o.getSid() + "',";
                        } else {
                            service.GetShipmentProviders(o);
                        }

                      /*  i++;*/
                        // 获取完一个店铺休眠3秒,继续下一店铺
                        sleep(3000);
                    } catch (Exception e) {
                        // 无Lazada店铺
                    }
                }
                if (shopIds.length() > 0) {
                    RetCode rc = service.updateShopStatus(shopIds);
                    if (rc.getCode() == 0) {
                        //修改成功
                        System.out.println("");
                    } else {
                        //修改失败
                        System.out.println("");
                    }
                }
                freshShop = false;
            } else {
                // 没有授权成功的Lazada店铺
                System.out.println("");
            }
        }

        // 获取待下载的Lazada店铺
        RetCode rt = service.findLazadaShopForDownload(null);
        if (rt.getObj() != null) {
            String manyStorageSku = "";
            Boolean manyStorageflag = false;
            String lazadaShopnumber = rt.getDetail();// 获取该用户当前有多少个Lazada店铺,如果店铺数量只有1~2个,那么每次下载1个店铺,都需要运行一下calcuOrder方法,否则会计算不及时
            if ("1".equals(lazadaShopnumber) || "2".equals(lazadaShopnumber)) {
                calcuOrderDiff = 1;
            }
            if ("1".equals(LazadaYml.getMultiFlag())) {// 如果配置文件中要求启用多仓规则,那么去获取
                // 只要有店铺需要下载订单,则先去获取多仓sku列表
                RetCode rtx = service.findManyStorageSkuFlag();// 查询用户是否有使用多仓,即查看DB_MULTI_WAREHOUSE表里有无记录
                if (rtx.getCode() == 0) {
                    manyStorageflag = true;// 有多仓,订单在导入入库时要拿sku到多仓查询下,获取真实sku
                    manyStorageSku = (String) rtx.getObj();// 多仓库的主sku列表(里面还包含了alias1)
                } else {
                    manyStorageflag = false;
                    manyStorageSku = "";
                }
            } else {// 否则也不去查询是否用户有使用多仓
                manyStorageflag = false;
                manyStorageSku = "";
            }
            service.setManyStorageflag(manyStorageflag);
            service.setManyStorageSku(manyStorageSku);
            ArrayList<DbShop> list = (ArrayList<DbShop>) rt.getObj();
            // 遍历店铺,获取订单
            /*int i = 0;*/
            for (DbShop o : list) {
                calcuCount++;
                // 下载某个店铺的的订单
                /*service.downloadLazadaOrderNew(o, "pending");*/
                String hour = ",8,9,10,11,12,13,14,15,16,17,18,";// 这里的意思是白天就只下载已支付订单。以防对数据库访问过多
                // 周平
                String hournew = Sys.getCtime().substring(8, 10);
                if (hour.indexOf("," + hournew + ",") <= 0) {
                  /*  service.downloadLazadaOrderNew(o, "ready_to_ship");*/
                }

                // 计算订单(如包裹重量,详单重量，订单重量，最佳包材,缺货详单)
                if (calcuCount > 20) {
                    calcuCount = 0;
                }
                if (calcuCount % calcuOrderDiff == 0) {
                    try {
                        service.calcuOrder();// 计算缺货
                    } catch (Exception e) {
                        System.out.println("");
                    }
                }
             /*   i++;*/
                // 获取完一个店铺休眠20秒,继续下一店铺
            }

            String sqlUptFlag = "update db_sell set flag='1' where flag='0' and orderid in(select orderid from db_order where status in('已支付','配货中'))";



        } else {// 无Lazada店铺需要下载订单
            System.out.println("");
        }




    }
}
