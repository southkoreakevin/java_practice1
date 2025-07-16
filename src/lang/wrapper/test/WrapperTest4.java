package lang.wrapper.test;

public class WrapperTest4 {

    public static void main(String[] args) {
        String str = "100";

        Integer number = Integer.valueOf(str);
        System.out.println(number);

        int number1 = number;
        System.out.println(number1);

        Integer number2 = number1;
        System.out.println(number2);
    }

}
