package scope;

public class Casting2 {

    public static void main(String[] args) {

        long maxIntValue = 2147483647;
        long maxIntOver = 2147483648L;
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println("maxIntValue casting" + intValue);

        intValue = (int) maxIntOver;
        System.out.println("maxOverValue casting " + intValue);
    }

}
