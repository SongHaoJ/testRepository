package com.threadModel;

import lombok.Data;

@Data
public abstract class ThreadModel extends Thread{
    //线程类型（order：下载线程）
    private String threadType;
    //任务来源（lazada：lazada订单下载）
    private String type;
    //线程状态（1、初始运行，2、执行完毕）
    private int status;
    //完成任务数量
    private Long taskNumber;
    //是否需要停止
    private Boolean stop;



}
