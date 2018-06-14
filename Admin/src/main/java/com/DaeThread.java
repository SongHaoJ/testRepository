package com;

public class DaeThread extends Thread {

    private DaeThread daeThread = new DaeThread();

    private DaeThread(){

    }

    public DaeThread getDaeThread(){
        daeThread.setDaemon(true);
        return daeThread;
    }

    @Override
    public void run() {
        //TODO 处理不急需进行的数据库操作与其他线程状态的修改

    }

}
