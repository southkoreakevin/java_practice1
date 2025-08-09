package thread.start.test;

import static util.MyLogger.log;

public class StartTest4Main {

    public static void main(String[] args) {

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                        log("A");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Thread thread1 = new Thread(runnable1, "Thread-A");
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(500);
                        log("B");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }


            }
        };
        Thread thread2 = new Thread(runnable2, "Thread-B");
        thread1.start();
        thread2.start();

    }


}
