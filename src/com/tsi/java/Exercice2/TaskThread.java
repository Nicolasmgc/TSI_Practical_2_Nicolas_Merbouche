package com.tsi.java.Exercice2;

public class TaskThread extends Thread{
    private String name;
    private int taskId;
    TaskManager taskManager;

    public TaskThread( String name, int taskId, TaskManager taskManager){
        this.name = name;
        this.taskId = taskId;
        this.taskManager = taskManager;
    }
    @Override
    public void run(){
        TaskManager taskManager = new TaskManager();
        taskManager.performTask(taskId, name);
    }


}
