package com.tsi.java.Exercice1;

import java.util.concurrent.atomic.AtomicLong;

public class PriorityThread extends Thread {
    private String name;

    public PriorityThread(String name) {
        this.name = name;
    }

    public String getValue() {
        return name;
    }


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

            System.out.printf("Name %s and current operation : %d\n", name, i);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.err.print(e);
            }


        }
    }
}
