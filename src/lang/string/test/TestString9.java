package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] str = email.split("@");
        for (String s : str) {
            System.out.println(s);
        }
    }

}
