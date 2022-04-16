package com.tsi.java.Exercice4;

import java.util.Random;

public class Producer extends Thread{
    Goods goods;

    public Producer(Goods goods) {
        this.goods = goods;
    }


    @Override
    public void run() {
        Random random = new Random();
        var goods = random.nextInt(16);

        System.out.println("Produced: " + goods);
    }


}
