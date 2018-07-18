package com.orderThread;

import com.bean.model.DbShop;
import com.bean.util.RetCode;
import com.bean.util.Sys;
import com.bean.yml.LazadaYml;
import com.controller.Priority;
import com.service.GetOrderService;
import com.service.LazadaService;
import com.threadModel.ThreadModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

//lazada订单下载线程
public class LazadaOrderThread extends ThreadModel {

    private static final Logger log = LoggerFactory.getLogger(LazadaOrderThread.class);
    private Boolean freshShop = true;
    private int calcuOrderDiff = 4;//计算缺货计间隔
    private int calcuCount = 0;//计算缺货计数器

    private LazadaService service;

    private LazadaYml yml;

    /*    private static List<Map<String,String>> skuMap;//多仓sku暂存
        private static boolean refreshSku;//多仓sku刷新标志*/
    {
        service = GetOrderService.getLazadaService();
        yml = GetOrderService.getLazadaYml();
    }

    /**
     * @param threadType 线程类型（order：下载线程）
     * @param type       任务来源（lazada：lazada订单下载）
     * @param status     线程状态（1、初始运行，2、执行完毕）
     * @param taskNumber 完成任务数量
     * @param stop       是否需要停止
     */
    public LazadaOrderThread(String threadType, String type, int status, Long taskNumber, Boolean stop) {
        super(threadType, type, status, taskNumber, stop);

    }

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
        log.info("lazadaStart！");
        Priority.changePriority(this);

        while (freshShop) {

            try {

                RetCode rt = service.findLazadaShopForDownload(null, "1");
                log.info("查找店铺");
                if (rt.getObj() != null) {
                    // 遍历
                    ArrayList<DbShop> list = (ArrayList<DbShop>) rt.getObj();
                    log.info("已找到店铺数量：" + list.size());
                    /*int i = 0;*/
                    String shopIds = "";
                    for (DbShop o : list) {
                        log.info("更新店铺：" + o.getName() + "令牌、物流信息");
                        try {
                            // 下载某个店铺认可物流方式

                            RetCode rc = service.getrefreshAccess_token(o);
                            if (rc.getCode() == 999) {
                                shopIds += "'" + o.getSid() + "',";
                            } else {
                                service.GetShipmentProviders(o);
                            }

                            /*  i++;*/
                            // 获取完一个店铺休眠1秒,继续下一店铺
                            sleep(1000);
                        } catch (Exception e) {
                            // 无Lazada店铺
                            System.out.println("无Lazada店铺");
                            freshShop = false;
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
                    System.out.println("没有授权成功的Lazada店铺");
                    freshShop = false;
                    try {
                        sleep(5 * 1000);
                    } catch (Exception e) {
                        freshShop = false;
                    }
                }
            } catch (Exception e) {
                log.error("异常信息:" + e.getMessage(), e);
                freshShop = false;
            }
        }

        // 获取待下载的Lazada店铺
        RetCode rt = service.findLazadaShopForDownload(null, "2");
        if (rt.getObj() != null) {
            log.info("查找待下载订单店铺，数量：" + rt.getDetail());
            String manyStorageSku = "";
            Boolean manyStorageflag = false;
            String lazadaShopnumber = rt.getDetail();// 获取该用户当前有多少个Lazada店铺,如果店铺数量只有1~2个,那么每次下载1个店铺,都需要运行一下calcuOrder方法,否则会计算不及时
            if ("1".equals(lazadaShopnumber) || "2".equals(lazadaShopnumber)) {
                calcuOrderDiff = 1;
            }
            if ("1".equals(yml.getMultiFlag())) {// 如果配置文件中要求启用多仓规则,那么去获取
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
                log.info("下载店铺："+o.getName()+"的订单");
                calcuCount++;
                // 下载某个店铺的的订单
                service.downloadLazadaOrderNew(o, "pending");
                String hour = ",8,9,10,11,12,13,14,15,16,17,18,";// 这里的意思是白天就只下载已支付订单。以防对数据库访问过多

                String hournew = Sys.getCtime().substring(8, 10);
                if (hour.indexOf("," + hournew + ",") <= 0) {
                    service.downloadLazadaOrderNew(o, "ready_to_ship");
                }

                // 计算订单(如包裹重量,详单重量，订单重量，最佳包材,缺货详单)
                if (calcuCount > 20) {
                    calcuCount = 0;
                }
                if (calcuCount % calcuOrderDiff == 0) {
                    //TODO 计算缺货
                }
                /*   i++;*/
                // 获取完一个店铺休眠20秒,继续下一店铺
                log.info("店铺" + o.getName()+"下载完毕");
            }
            service.updateSell();
            try {
                sleep(1000);
            } catch (Exception e) {

            }
        } else {// 无Lazada店铺需要下载订单
            System.out.println("无Lazada店铺需要下载订单");
            try {
                sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}
