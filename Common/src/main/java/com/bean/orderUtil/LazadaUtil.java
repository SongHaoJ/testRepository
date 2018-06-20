package com.bean.orderUtil;

import java.math.BigDecimal;

public class LazadaUtil {
    //TODO yml
    private String fershHost = "";


    public static String getScApiHost(String countryCode) {
        if ("my".equals(countryCode)) {
            return "https://api.lazada.com.my/rest";
        } else if ("id".equals(countryCode)) {
            return "https://api.lazada.co.id/rest";
        } else if ("th".equals(countryCode)) {
            return "https://api.lazada.co.th/rest";
        } else if ("ph".equals(countryCode)) {
            return "https://api.lazada.com.ph/rest";
        } else if ("vn".equals(countryCode)) {
            return "https://api.lazada.vn/rest";
        } else {
            return "https://api.lazada.sg/rest";
        }
    }

    public static BigDecimal mul(Number... nums){
        if(nums==null||nums.length==0) {
            return new BigDecimal(0);
        }else if(nums.length==1){
            return new BigDecimal(nums[0].toString());
        }else{
            Double n = 1d;
            for (Number num: nums) {
                if(num!=null){
                    n *= num.doubleValue();
                }
            }
            return new BigDecimal(n);
        }
    }

    public static BigDecimal div(Number divisor,Number dividend){
        if(divisor==null||dividend==null||dividend.intValue()==0||divisor.intValue()==0){
            return new BigDecimal(0);
        }else{
            return new BigDecimal(divisor.doubleValue()/dividend.doubleValue());
        }

    }


}
