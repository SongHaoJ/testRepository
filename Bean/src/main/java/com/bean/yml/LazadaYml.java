package com.bean.yml;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "Lazada")
public class LazadaYml {

    private static String appkey;//开发者令牌
    private static String secret;//开发者密钥
    private static String fershHost;//令牌刷新地址
    private static Double platformFeeRate;//平台交易费
    private static String skuPosition;// 如果sku遇到@#,默认获取第1列,如果是1,则获取第2列
    private static String multiFlag;// 订单下载是否执行多仓规则,如果为0,即使配了多仓也不执行,那么这种用户的多仓基本上就只是用来调拨用,不用来匹配订单
    private static Boolean holdSpace;//是否保留sku中的空格,默认不保留

    public static String getSecret() {
        return secret;
    }

    public static String getAppkey() {
        return appkey;
    }

    public static String getFershHost() {
        return fershHost;
    }

    public static Double getPlatformFeeRate() {
        return platformFeeRate;
    }

    public static String getSkuPosition() {
        return skuPosition;
    }

    public static String getMultiFlag() {
        return multiFlag;
    }

    public static Boolean getHoldSpace() {
        return holdSpace;
    }

}
