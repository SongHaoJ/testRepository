package com.ServiceImpl;

import com.bean.model.DbLazadaorderinfo;
import com.bean.model.DbMoneyrate;
import com.bean.model.DbProduct;
import com.bean.model.DbShop;
import com.bean.util.RetCode;
import com.service.LazadaService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LazadaServiceImpl implements LazadaService {




    @Override
    public RetCode findLazadanewproduct(String shopid) {
        return null;
    }

    @Override
    public RetCode findLazadaShopForDownload(String shopId) {
        RetCode rt = new RetCode(1000, "操作失败", "操作失败");
        ArrayList<DbShop> list = new ArrayList<DbShop>();
/*if (Sys.isNull(shopId)) {
				sql = "select sid,corpid,name,tokenid,reserve9,reserve18,reserve19,
				orderoper,selluserid,amazonurlname from db_shop where openflag='1' and reserve11='18'
				and tokenflag='40'  and ((reserve9 is not null and sysdate-to_date(reserve9,'yyyyMMddHH24miss')>1/24)
				or reserve9 is null)  order by reserve9 Nulls first";
			} else {
				sql = "select sid,corpid,name,tokenid,reserve9,reserve18,reserve19,orderoper,selluserid,
				amazonurlname from db_shop where openflag='1' and reserve11='18' and tokenflag='40' and sid in ('"
						+ shopId
						+ "') and ((reserve9 is not null and sysdate-to_date(reserve9,'yyyyMMddHH24miss')>1/24)
						or reserve9 is null)  order by reserve9 Nulls first";
			}
*/




        return null;
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

    @Override
    public RetCode findMoneyrate(DbMoneyrate obj) {
        return null;
    }

    @Override
    public void saveMoneyrate(String currencyId, double moneyrate) {

    }

    @Override
    public RetCode updateSplitPaypalFee(int rownumber, String orderid) {
        return null;
    }

}
