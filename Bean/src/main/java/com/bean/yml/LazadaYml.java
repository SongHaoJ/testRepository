package com.bean.yml;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author songhao
 */
@Data
@Component
@ConfigurationProperties(prefix = "lazada")
public class LazadaYml {

    /**
     * 开发者令牌
     */
    private String appKey;

    /**
     * 开发者密钥
     */
    private String secret;

    /**
     * 令牌刷新地址
     */
    private String freshHost;

    /**
     * 平台交易费
     */
    private Double platformFeeRate;

    /**
     * 如果sku遇到@#,默认获取第1列,如果是1,则获取第2列
     */
    private String skuPosition;

    /**
     * 订单下载是否执行多仓规则,如果为0,即使配了多仓也不执行,那么这种用户的多仓基本上就只是用来调拨用,不用来匹配订单
     */
    private String multiFlag;

    /**
     * 是否保留sku中的空格,默认不保留
     */
    private Boolean holdSpace;

}
