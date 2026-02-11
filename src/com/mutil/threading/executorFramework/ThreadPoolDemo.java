package com.mutil.threading.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Separate class for the task (implements Runnable, no lambda)
class MyTask implements Runnable {
    private String taskName;

    public MyTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " executing: " + taskName);
        try {
            Thread.sleep(2000);  // Simulate work
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(Thread.currentThread().getName() + " finished: " + taskName);
    }
}

// Main class to create pool and submit tasks
public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);  // Create fixed thread pool [page:0][web:11]

        // Submit 5 tasks
        for (int i = 1; i <= 6; i++) {
            MyTask task = new MyTask("Task-" + i);
            executor.execute(task);  // Submit task to pool [page:0]
        }

        executor.shutdown();  // Initiate shutdown after submitted tasks [page:0]
    }
}

