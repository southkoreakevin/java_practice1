package thread.start.test;

import static util.MyLogger.log;

public class StartTest3Main {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {

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

        };
        Thread thread = new Thread(runnable, "counter");
        thread.start();


    }
}