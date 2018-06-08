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
        //TODO

    }

}
