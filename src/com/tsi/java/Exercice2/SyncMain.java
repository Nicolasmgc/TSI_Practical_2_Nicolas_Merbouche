package com.tsi.java.Exercice2;

public class SyncMain {
    public static void main(String[] args){

        final TaskManager taskManager = new TaskManager();

        TaskThread threadn1 = new TaskThread("Mithun", 1, taskManager);
        TaskThread threadn2 = new TaskThread("Martin", 2, taskManager);

        threadn1.start();
        threadn2.start();
    }



}
