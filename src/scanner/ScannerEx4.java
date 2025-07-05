package scanner;

import java.util.Scanner;

public class ScannerEx4 {

    public static void main(String[] args) {
        System.out.printf("구구단의 단 수를 입력해주세요: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " x " + num + " = " + num * i);
        }
    }

}
