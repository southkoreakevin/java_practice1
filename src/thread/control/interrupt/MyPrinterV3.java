package thread.control.interrupt;

import static util.MyLogger.log;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MyPrinterV3 {

    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread printerThread = new Thread(printer, "printer");
        printerThread.start();

        Scanner userInput = new Scanner(System.in);
        while (true) {
            log("priner할 문서를 입력하세요. 종료 (q) : ");
            String input = userInput.nextLine();
            if (input.equals("q")) {
                printerThread.interrupt();
                break;
            }

            printer.addJob(input);
        }
    }

    static class Printer implements Runnable {

        Queue<String> jobQueue = new ConcurrentLinkedQueue<>();

        @Override
        public void run() {
            while (!Thread.interrupted()) {
                if (jobQueue.isEmpty()) {
                    continue;
                }
                try {
                    String job = jobQueue.poll();
                    log("출력 시작: " + job + ", 대기 문서: " + jobQueue);
                    Thread.sleep(3000);
                    log("출력 완료: " + job);
                } catch (InterruptedException e) {
                    log("interrupt!");
                    break;
                }

            }
            log("priniter end");
        }

        public void addJob(String input) {
            jobQueue.offer(input);
        }
    }

}
