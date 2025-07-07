package array;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요 ");

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                System.out.println(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");

        }
        System.out.println();
    }

}
