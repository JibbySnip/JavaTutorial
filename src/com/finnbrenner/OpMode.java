package com.finnbrenner;

public abstract class OpMode implements Op {
    public boolean notStarted = true;
    public boolean isRunning = false;
//    abstract void init();
//    abstract void initLoop();
//    abstract void start();
//    abstract void loop();
//    abstract void stop();

    public void run() {
        init();
        while (notStarted) {
            initLoop();
        }
        start();
        isRunning = true;
        while (isRunning) {
            loop();
        }
        stop();

    }

}
