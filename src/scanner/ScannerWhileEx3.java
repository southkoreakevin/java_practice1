package scanner;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu;
        int price;
        int num;
        int sum = 0;
        while (true) {
            System.out.println("1: 삼품입력, 2: 결제, 3: 프로그램 종료 ");
            int option = scanner.nextInt();
            if (option == 3) {
                break;
            }

            switch (option) {
                case 1:

                    System.out.print("상품명을 입력하세요: ");
                    menu = scanner.nextLine();
                    scanner.nextLine();
                    System.out.print("상품의 가격을 입력하세요: ");
                    price = scanner.nextInt();
                    System.out.print("구매 수량을 입력하세요: ");
                    num = scanner.nextInt();
                    sum += price * num;

                    break;
                case 2:
                    System.out.println("총 비용: " + sum);
                    sum = 0;
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다. ");
                    break;
            }
        }

    }

}
