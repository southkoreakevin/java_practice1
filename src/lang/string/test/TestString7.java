package lang.string.test;

public class TestString7 {

    public static void main(String[] args) {
        String original = "           Hello Java     ";
        original = original.strip();
        System.out.println(original);
    }

}
