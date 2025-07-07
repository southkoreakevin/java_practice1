package array;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num + "개의 정수를 입력하세요: ");
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        int small = arr[0];
        int big = arr[0];

        for (int i = 0; i < num; i++) {
            if (small > arr[i]) {
                small = arr[i];
            }
            if (big < arr[i]) {
                big = arr[i];
            }
        }
        System.out.println("big: " + big);
        System.out.println("small: " + small);
    }

}
