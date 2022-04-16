package com.tsi.java.Exercice3;

import java.util.concurrent.BlockingQueue;

public class TakingThread extends Thread {
    BlockingQueue blockingQueue;
    public TakingThread(BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(blockingQueue.take());
        } catch (InterruptedException e) {
            System.err.print(e);
        }
    }
}
