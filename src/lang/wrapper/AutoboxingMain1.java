package lang.wrapper;

public class AutoboxingMain1 {

    public static void main(String[] args) {
        int value = 7;
//        Integer boxedValue = Integer.valueOf(value);
        Integer boxedValue = value;

//        int unboxedValue = boxedValue.intValue();
        int unboxedValue = boxedValue;
        System.out.println("boxedvalue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }

}
