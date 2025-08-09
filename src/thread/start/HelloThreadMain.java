package thread.start;

public class HelloThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main()");
        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": start() call");
        helloThread.start();
        System.out.println(Thread.currentThread().getName() + ":start() after");
        System.out.println(Thread.currentThread().getName() + ": main() end");
    }

}
