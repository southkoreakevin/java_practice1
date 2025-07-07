package array;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        int[] arr = new int[5];

        System.out.println("input 5 정수");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("입력한 정수를 거꾸로 출력");
        for (int i = 4; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");

        }
    }
}
