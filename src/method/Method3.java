package method;

public class Method3 {

    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출전, number: " + number);
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후 number: " + number);

    }

    public static void changeNumber(int number) {
        System.out.println("2. changenumber 변경전, number : " + number);
        number = number * 2;
        System.out.println("3. changenumber 변경후 , number : " + number);
    }

}
