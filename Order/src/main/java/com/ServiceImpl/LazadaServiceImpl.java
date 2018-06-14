package com.ServiceImpl;

import com.Service.LazadaService;
import com.bean.dao.DbShopMapper;
import com.bean.model.DbLazadaorderinfo;
import com.bean.model.DbProduct;
import com.bean.model.DbShop;
import com.bean.util.RetCode;
import com.bean.util.Sys;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.lazada.lazop.api.LazopClient;
import com.lazada.lazop.api.LazopRequest;
import com.lazada.lazop.api.LazopResponse;
import com.lazada.lazop.util.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

@Service
public class LazadaServiceImpl implements LazadaService {

    @Autowired
    private DbShopMapper shopMapper;

    private Calendar cld = Calendar.getInstance();


    @Override
    public RetCode findLazadanewproduct(String shopid) {
        return null;
    }

    @Override
    public RetCode getrefreshAccess_token(DbShop shop) {
        RetCode rt = new RetCode(1000, "无记录", "无记录");
        cld.setTime(new Date());
        Long time = cld.getTimeInMillis();

        Long refresh = shop.getReserve18().longValue();
        if (time < (refresh * 1000 + 3600 * 48 * 1000)) {
           /* try {
                LazopClient client = new LazopClient(ScApiHost, appkey, appSecret);
                LazopRequest request = new LazopRequest();
                request.setApiName("/auth/token/refresh");
                request.addApiParameter("refresh_token", shop.getReserve19());
                LazopResponse response = client.execute(request);
                response = client.execute(request);
                if (response.isSuccess()) {

                    shop.setTokenid(re.getString("access_token"));
                    Long expiry_Time = re.getLong("refresh_expires_in");
                    shop.setReserve19(re.getString("refresh_token"));
                    Long refreshTime = time / 1000 + expiry_Time - 2 * 3600;
                    shop.setReserve18(Double.valueOf(refreshTime));
                    String sql = "update db_shop set tokenid ='" + shop.getTokenid() + "',reserve18 ='"
                            + shop.getReserve18() + "',reserve19='" + shop.getReserve19() + "' where sid='"
                            + shop.getSid();
                    lazadaMgr.updateExecuteSQL(sql);
                    rt.setCode(0);
                    rt.setDesc("更新令牌成功");
                    rt.setObj(shop);
                    rt.setDetail(refreshTime + "");
                }
            } catch (ApiException e) {
                rt.setCode(1000);
                rt.setDesc("更新令牌异常：" + e.getMessage());
            }*/
        } else {
            rt.setCode(999);
            rt.setDesc("令牌过期，请重新授权");
        }
        return rt;
    }

    @Override
    public RetCode findLazadaShopForDownload(String shopId) {
        RetCode rt = new RetCode(1000, "操作失败", "操作失败");
        try{
            ArrayList<DbShop> list = new ArrayList<DbShop>();
            Map<String, String> paramMap = new HashMap<String, String>();
            paramMap.put("openflag", "1");
            paramMap.put("shoptypeid", "18");
            paramMap.put("tokenflag", "40");

            if (!Sys.isNull(shopId)) {
                paramMap.put("shopIdList", shopId);
            }

            List<DbShop> shopList = shopMapper.selectShopForOrder(paramMap);
            List<DbShop> resultList = new ArrayList<DbShop>();
            Iterator<DbShop> iterator = shopList.iterator();
            while (iterator.hasNext()) {
                DbShop shop = iterator.next();
                if (Sys.isNull(shop.getTokenid()) == false && shop.getTokenid().length() >= 10
                        && Sys.isNull(shop.getSelluserid()) == false && Sys.isNull(shop.getAmazonurlname()) == false) {// 必须要有令牌和登陆账号
                    if (shop.getReserve18() == null) {
                        shop.setReserve18(new BigDecimal(0D));
                    } // 如果无设置,则默认是0
                    resultList.add(shop);
                }
            }
            if (resultList.size() > 0) {// 如果有lazada的店铺需要下载
                rt.setCode(0);
                rt.setDesc("查询成功");
                rt.setDetail("" + list.size());
                rt.setObj(list);
            } else {
                rt.setCode(1000);
                rt.setDesc("无店铺需要下载Lazada订单");
            }
        }catch(Exception e){
            rt.setCode(999);
            rt.setDesc("查询异常");
            rt.setDetail(e.getMessage());
        }
        return rt;
    }

    @Override
    public void updateCalculateNew(long groupid) {

    }

    @Override
    public void saveOrder(DbLazadaorderinfo obj, String skuPosition, double moneyrate, double platformFeeRate) {

    }

    @Override
    public RetCode updateMabangData() {
        return null;
    }

    @Override
    public RetCode updatePackagingWeight() {
        return null;
    }

    @Override
    public RetCode updateCalcuSellWeight() {
        return null;
    }

    @Override
    public RetCode updateCalcuOrderPackageWeight() {
        return null;
    }

    @Override
    public RetCode updateCalcuOrderWeight() {
        return null;
    }

    @Override
    public RetCode findProductForAlertflag() {
        return null;
    }

    @Override
    public RetCode updateCalcuSellAlertflag(DbProduct obj) {
        return null;
    }


}
