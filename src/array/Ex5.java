package array;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num + "개의 정수를 입력하세요: ");
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += arr[i];
        }
        System.out.println("입력한 정수의 합계: " + sum);

        double avg = (double) sum / num;
        System.out.println("입력한 정수의 평균: " + avg);
    }
}
