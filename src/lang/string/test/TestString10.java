package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] results = fruits.split(",");
        for (String r : results) {
            System.out.println(r);
        }
        String result = String.join("->", results);
        System.out.println(result);

    }

}
