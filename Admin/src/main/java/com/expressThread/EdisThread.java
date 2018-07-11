package com.expressThread;

import com.bean.model.DbExpressconfig;
import com.bean.model.DbExpresstype;
import com.bean.util.RetCode;
import com.service.EdisEbayService;
import com.service.GetService;
import com.sun.xml.internal.ws.message.FaultMessage;
import com.threadModel.ThreadModel;

import java.util.ArrayList;

public class EdisThread extends ThreadModel {

    private EdisEbayService edisService;


    {
        edisService = GetService.getEdisEbayService();
    }

    /**
     * @param threadType 线程类型（order：下载线程）
     * @param type       任务来源（lazada：lazada订单下载）
     * @param status     线程状态（1、初始运行，2、执行完毕）
     * @param taskNumber 完成任务数量
     * @param stop       是否需要停止
     */
    public EdisThread(String threadType, String type, int status, Long taskNumber, Boolean stop) {
        super(threadType, type, status, taskNumber, stop);
    }

    private boolean initTableFlag = true;
    private String url = "https://api.edisebay.com/v1/api";// Edis 正式环境地址
    // https://sandbox.edisebay.com/v1/api Edis 沙箱环境地址

    /**
     * 最小申报价值（美元）
     */
    private double declaredValueMinUSD = 0D;
    /**
     * 最大申报价值（美元）
     */
    private double declaredValueMaxUSD = 0D;
    /**
     * 当前货运方式ID
     */
    private String expressSequenceid;











}
