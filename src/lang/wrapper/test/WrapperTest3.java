package lang.wrapper.test;

public class WrapperTest3 {

    public static void main(String[] args) {
        String str = "100";

        Integer number = Integer.valueOf(str);
        System.out.println(number);

        int number1 = number.intValue();
        System.out.println(number1);

        Integer number2 = Integer.valueOf(number1);
        System.out.println(number2);
    }

}
