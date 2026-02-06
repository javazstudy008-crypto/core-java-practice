package com.mutil.threading.synchro;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

    public static void main(String[] args) {

        // Step 1: Create fixed thread pool of size 2
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Step 2: Submit 5 tasks
        executor.execute(new WorkerTask("A"));
        executor.execute(new WorkerTask("B"));
        executor.execute(new WorkerTask("C"));
        executor.execute(new WorkerTask("D"));
        executor.execute(new WorkerTask("E"));

        // Step 3: Shutdown executor
        executor.shutdown();
    }
}

class WorkerTask implements Runnable {

    private String taskName;

    WorkerTask(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        System.out.println(
                "Task " + taskName +
                        " started by " +
                        Thread.currentThread().getName()
        );

        try {
            Thread.sleep(2000); // simulate work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(
                "Task " + taskName +
                        " finished by " +
                        Thread.currentThread().getName()
        );
    }
}
