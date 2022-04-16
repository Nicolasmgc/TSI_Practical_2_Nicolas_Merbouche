package com.tsi.java.Exercice2;

public class TaskManager {
    public static void performTask(int taskld, String name){
        System.out.println("Current thread name : " + name + " Current value of taskId " + taskld);


        try {
            Thread.sleep(4);
        } catch (InterruptedException e) {
            System.err.print(e);
        }
        System.out.println("Current thread name after sleep 4mls : " + name + " Current value of taskId after sleep 4mls " + taskld);



    }
}
