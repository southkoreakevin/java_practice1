package method;

public class Ex2 {

    public static void main(String[] args) {
        printer(5, "hello, world");
    }

    public static void printer(int number, String message) {
        for (int i = 0; i < number; i++) {
            System.out.println(message);
        }
    }
}
