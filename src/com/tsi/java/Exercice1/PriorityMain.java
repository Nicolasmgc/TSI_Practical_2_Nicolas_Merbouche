package com.tsi.java.Exercice1;

public class PriorityMain {
    public static void main(String[] args){
        Thread min = new PriorityThread("min");
        Thread max = new PriorityThread("max");

        min.start();
        max.start();



    }
}
