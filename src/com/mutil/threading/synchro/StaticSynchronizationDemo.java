package com.mutil.threading.synchro;

public class StaticSynchronizationDemo {
    public static void main(String[] args) throws Exception {
        PrintThread t1 = new PrintThread();
        PrintThread t2 = new PrintThread();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(Printer.pagesPrinted);       //Expecting 2000
    }
}
class Printer {
    static int pagesPrinted = 0;

    static synchronized void printPage() {
        pagesPrinted++;
    }
}

class PrintThread extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Printer.printPage();
        }
    }
}

