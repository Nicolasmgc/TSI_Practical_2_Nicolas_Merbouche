package com.tsi.java.Exercice3;

import java.util.concurrent.BlockingQueue;

public class AddingThread extends Thread{
    BlockingQueue blockingQueue;
    public AddingThread(BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }
    @Override
    public void run() {
        for(int i = 0; i < 3; i++){
            blockingQueue.add("Element number " + i);

            System.out.println("Element number " + i + " has been added");
        }
    }
}
