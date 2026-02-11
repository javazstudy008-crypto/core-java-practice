package com.mutil.threading.synchro;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
public class DeadlockResolvedDemo {
    public static void main(String[] args) {
        ReentrantLock lockA = new ReentrantLock();
        ReentrantLock lockB = new ReentrantLock();
        Thread t1 = new Thread_One(lockA, lockB);
        Thread t2 = new Thread_Two(lockA, lockB);
        t1.start();
        t2.start();
    }
}
class Thread_One extends Thread {
    private ReentrantLock lockA;
    private ReentrantLock lockB;

    public Thread_One(ReentrantLock lockA, ReentrantLock lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }
    public void run() {

        while (true) {
            try {
                if (lockA.tryLock(1000, TimeUnit.MILLISECONDS)) {
                    try {
                        System.out.println("ThreadOne: Locked LockA");
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if (lockB.tryLock(5000, TimeUnit.MILLISECONDS)) {
                            try {
                                System.out.println("ThreadOne: Locked LockB");
                                break; // SUCCESS → exit loop
                            } finally {
                                lockB.unlock();
                            }
                        } else {
                            System.out.println("ThreadOne: Could not lock LockB, releasing LockA");
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } finally {
                        lockA.unlock();
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Thread_Two extends Thread {
    private ReentrantLock lockA;
    private ReentrantLock lockB;
    public Thread_Two(ReentrantLock lockA, ReentrantLock lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }
    public void run() {
        while (true) {
            try {
                if (lockB.tryLock(1000, TimeUnit.MILLISECONDS)) {
                    try {
                        System.out.println("ThreadTwo: Locked LockB");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        if (lockA.tryLock(1000, TimeUnit.MILLISECONDS)) {
                            try {
                                System.out.println("ThreadTwo: Locked LockA");
                                break; // SUCCESS → exit loop
                            } finally {
                                lockA.unlock();
                            }
                        } else {
                            System.out.println("ThreadTwo: Could not lock LockA, releasing LockB");
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } finally {
                        lockB.unlock();
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

