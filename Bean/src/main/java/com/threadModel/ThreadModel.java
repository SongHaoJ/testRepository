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

    /**
     *
     * @param threadType 线程类型（order：下载线程）
     * @param type 任务来源（lazada：lazada订单下载）
     * @param status 线程状态（1、初始运行，2、执行完毕）
     * @param taskNumber 完成任务数量
     * @param stop 是否需要停止
     */
    public ThreadModel(String threadType, String type, int status, Long taskNumber, Boolean stop) {
        this.setName(type+":"+threadType);
        this.threadType = threadType;
        this.type = type;
        this.status = status;
        this.taskNumber = taskNumber;
        this.stop = stop;
    }
}
