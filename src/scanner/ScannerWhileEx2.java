package scanner;

import java.util.Scanner;

public class ScannerWhileEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("상품의 가격을 입력하세요 (-1을 입력하면 종료): ");

        double sum = 0, average;
        int num;
        int count = 0;
        while (true) {

            num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            sum += num;
            count++;

        }
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균 " + sum / count);
    }

}
