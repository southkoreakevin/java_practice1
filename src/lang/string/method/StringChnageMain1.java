package lang.string.method;

public class StringChnageMain1 {

    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java";

        System.out.println("index from 7 부터 부분 문자열 : " + str.substring(7));
        System.out.println("index from 7 to 12 String: " + str.substring(7, 12));
        System.out.println(str.concat("!!!"));
        System.out.println(str.replace("Java", "World"));
        System.out.println(str.replaceFirst("Java", "World"));
    }

}
