package com.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "params")
public class DemoParam {
    private  String appKey;//开发者令牌
    private  String secret;//开发者密钥
    private  String fershHost;//令牌刷新地址
    private  Double platformFeeRate;//平台交易费
    private  String skuPosition;// 如果sku遇到@#,默认获取第1列,如果是1,则获取第2列
    private  String multiFlag;// 订单下载是否执行多仓规则,如果为0,即使配了多仓也不执行,那么这种用户的多仓基本上就只是用来调拨用,不用来匹配订单
    private  Boolean holdSpace;//是否保留sku中的空格,默认不保留


}
