package com.bean.util;

import java.math.BigDecimal;

public class NumberUtil {

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
