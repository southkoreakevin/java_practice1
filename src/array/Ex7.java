package array;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        int[][] arr = new int[4][3];
        Scanner scanner = new Scanner(System.in);
        int[] result = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번재 학생");
            System.out.print("국어 점수: ");
            int score1 = scanner.nextInt();
            System.out.print("영어 점수: ");
            int score2 = scanner.nextInt();
            System.out.print("수학 점수: ");
            int score3 = scanner.nextInt();

            int sum = score1 + score2 + score3;
            double avg = (double) sum / 3;

            result[i] = sum;
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(result[i]);
            double avg = (double) result[i] / 3;
            System.out.println(avg);
        }
    }

}
