package scanner;

import java.util.Scanner;

public class ScannerEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            int temp;
            temp = num1;
            num1 = num2;
            num2 = temp;

        }
        int gamp = num2 - num1;

        for (int i = 0; i < gamp; i++) {
            System.out.print(num1 + i);
            System.out.print(", ");
        }
        System.out.print(num2);
    }
}
