package method;

public class Method1 {

    public static void main(String[] args) {
        int sum1 = add(5, 10);
        System.out.println("result1 : " + sum1);
        int sum2 = add(15, 20);
        System.out.println("result2 : " + sum2);
    }

    public static int add(int a, int b) {
        System.out.println(a + "+" + b + "연산 수행");
        int sum = a + b;
        return sum;
    }
}
