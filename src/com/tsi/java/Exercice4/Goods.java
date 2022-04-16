package com.tsi.java.Exercice4;

public class Goods {
    int amount;

    synchronized void produce(int amount) throws InterruptedException {
        while( amount != 0){
            wait();
        }
        notify();
        this.amount = amount;



    }

    synchronized int consume(int amount) throws InterruptedException {
        while (amount == 0){
            wait();

        }
        notify();
        return amount;
    }
}
