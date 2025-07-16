package lang.string.test;

public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int result = 0;
        for (String a : arr) {
            result += a.length();

        }
        System.out.println(result);
    }

}
