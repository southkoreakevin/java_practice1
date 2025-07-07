package array;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        int[][] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생수를 입력하세요: ");
        int num = scanner.nextInt();
        arr = new int[num][3];

        int[] result = new int[num];

        for (int j = 0; j < num; j++) {

            System.out.println((j + 1) + "번재 학생");
            System.out.print("국어 점수: ");
            arr[j][0] = scanner.nextInt();
            System.out.print("영어 점수: ");
            arr[j][1] = scanner.nextInt();
            System.out.print("수학 점수: ");
            arr[j][2] = scanner.nextInt();

            int sum = arr[j][0] + arr[j][1] + arr[j][2];

            result[j] = sum;
        }

        for (int i = 0; i < num; i++) {
            System.out.println(result[i]);
            double avg = (double) result[i] / 3;
            System.out.println(avg);

        }

    }
}
