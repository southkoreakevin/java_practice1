package lang.string.test;

public class TestString4 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        int result = str.indexOf(ext);
        String first = str.substring(0, result);
        String last = str.substring(result);

        System.out.println(first);
        System.out.println(last);
    }

}
