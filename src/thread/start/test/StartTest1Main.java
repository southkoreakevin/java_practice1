package thread.start.test;

import static util.MyLogger.log;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StartTest1Main {

    public static void main(String[] args) {
//        CounterThread counterThread = new CounterThread();
//
//        Thread thread = new Thread(counterThread);
//        thread.setName("counter");
//        thread.start();
        Thread thread = new Thread(new CounterThread(), "counter");
        thread.start();
    }

    static class CounterThread implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                    log("value : " + i);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
