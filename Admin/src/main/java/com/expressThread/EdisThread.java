package com.expressThread;

import com.bean.yml.EdisYml;
import com.threadModel.ThreadModel;

public class EdisThread extends ThreadModel {

/*    private EdisEbayService service;*/

    private EdisYml yml;

    {
       /* service = GetExpressService.getService();
        yml = GetExpressService.getEdisYml();*/
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

    @Override
    public void run() {

       /* service.getChannel();*/
    }


}
