package com.tsi.java.Exercice4;

import java.util.Random;

public class Consumer extends Thread{
    Goods goods;
    public Consumer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        Random random = new Random();
        var goods = random.nextInt(14);

        System.out.println("Consumed: " + goods);
    }



}
