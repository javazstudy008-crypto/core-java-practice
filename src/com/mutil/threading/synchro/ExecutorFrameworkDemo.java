package com.mutil.threading.synchro;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

    public class ExecutorFrameworkDemo {

        public static void main(String[] args) {
            //    Executor e = Executors.newFixedThreadPool(3);

            // Step 1: Create Executor (Thread Pool)
            ExecutorService executor = Executors.newFixedThreadPool(2);

            // Step 2: Submit tasks
            executor.execute(new Task("A"));
            executor.execute(new Task("B"));
            executor.execute(new Task("C"));
            executor.execute(new Task("D"));

            // Step 3: Shutdown executor
            executor.shutdown();
        }
    }

class Task implements Runnable {

    private String taskName;

    Task(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        System.out.println(
                "Task " + taskName +
                        " executed by " +
                        Thread.currentThread().getName()
        );

        try {
            Thread.sleep(1000); // simulate work
        } catch (Exception e) {}
    }
}


