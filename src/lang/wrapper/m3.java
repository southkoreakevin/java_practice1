package lang.wrapper;

public class m3 {

    public static void main(String[] args) {
        long currentTimeMills = System.currentTimeMillis();
        System.out.println(currentTimeMills);
        long currentTimeNano = System.nanoTime();
        System.out.println(currentTimeNano);
        System.out.println(System.getenv());
        System.out.println(System.getProperties());
    }

}
