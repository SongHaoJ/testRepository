package com.expressModel;

import com.bean.dao.DbAsktradernumberMapper;
import com.bean.dao.DbExpressconfigMapper;
import com.bean.dao.DbExpresstypeMapper;
import com.bean.dao.DbOrderMapper;
import com.bean.model.DbExpressconfig;
import com.bean.model.DbExpresstype;
import com.bean.util.RetCode;
import com.gourpBean.ExpressInfo;
import com.gourpBean.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ExpressModelImpl implements ExpressModel {
    @Autowired
    private DbExpressconfigMapper expressconfigMapper;
    @Autowired
    private DbExpresstypeMapper expresstypeMapper;
    @Autowired
    private DbAsktradernumberMapper asktradernumberMapper;
    @Autowired
    private DbOrderMapper orderMapper;

    @Override
    public int selectOrInsertExpress() {
        return 0;
    }

    @Override
    public RetCode findexpressconfig(String ordertype) {
        RetCode rt = new RetCode(1000, "查无记录", "");
        ordertype = ordertype.replace(",,", ",");
        try {
            List<DbExpressconfig> list = expressconfigMapper.selectConfigByOrderTYpes(ordertype);
            if (list.size() > 0) {
                rt.setCode(0);
                rt.setDesc("查询物流配置信息成功");
                rt.setObj(list);
            } else {
                rt.setCode(1000);
                rt.setDesc("无" + ordertype + "物流配置信息");
            }
        } catch (Exception e) {
            rt.setCode(999);
            rt.setDesc("查询物流配置标签Exception异常:" + e.getMessage());
            System.out.println("查询物流配置标签Exception异常:" + e.getMessage());
        }
        return rt;
    }

    @Override
    public RetCode findExpresstype(String expresstypeid) {
        RetCode rt = new RetCode(1000, "查询失败", null);
        String sql1 = " ";
        try {
            List<DbExpresstype> result = expresstypeMapper.selectByPrimaryKey(expresstypeid);
            DecimalFormat df = new DecimalFormat(".##");// 申报价值保存两位小数
            HashMap<String, DbExpresstype> hashMap = new HashMap<String, DbExpresstype>();
            Iterator<DbExpresstype> iterator = result.iterator();
            while (iterator.hasNext()) {
                DbExpresstype dt = iterator.next();
                // 读取货运方式中的申报价值
                double decValMin = dt.getDeclaredvaluemin().doubleValue();
                double decValMax = dt.getDeclaredvaluemax().doubleValue();
                String decCuy = dt.getDeclcurrency();
                if ("RMB".equals(decCuy)) {// 如果是人民币就统一转为美元
                    double min = Double.valueOf(df.format(decValMin / 6.4));
                    double max = Double.valueOf(df.format(decValMax / 6.4));
                    if (min <= 0.01) {
                        dt.setDeclaredvaluemin(new BigDecimal(0.01D));
                    }
                    if (max <= 0.01) {
                        dt.setDeclaredvaluemax(new BigDecimal(dt.getDeclaredvaluemin().doubleValue() + 0.01D));
                    }
                    dt.setDeclaredvaluemin(new BigDecimal(min));
                    dt.setDeclaredvaluemax(new BigDecimal(max));
                    dt.setDeclcurrency("USD");
                }
                hashMap.put(dt.getSequenceid(), dt);
            }
            if (hashMap.size() > 0) {
                rt.setCode(0);
                rt.setDesc("查询成功");
                rt.setObj(hashMap);
            } else {
                rt.setCode(1000);
                rt.setDesc("无货运方式");
            }
        } catch (Exception e) {
            rt.setCode(999);
            rt.setDesc("EbayMgr.findExpresstype方法Exception异常:" + e.getMessage());
            e.printStackTrace();
        }
        return rt;
    }

    @Override
    public List<ExpressInfo> selectExpressInfo(String ordertype, BigDecimal errflag) {

        return null;
    }

    @Override
    public OrderInfo selectOrderInfo(String orderid) {

        return null;
    }


}
