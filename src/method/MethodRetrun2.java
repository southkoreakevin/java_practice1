package method;

public class MethodRetrun2 {

    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "age, 미성년자는 출입이 불가합니다. ");
            return;
        }
        System.out.println(age + "살, 입장하세요.");
    }

}
