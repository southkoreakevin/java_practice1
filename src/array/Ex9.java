package array;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxProduct = 10;
        int productCount = 0;
        String[] productNames = new String[maxProduct];
        int[] productPrices = new int[maxProduct];

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.println("메뉴를 선택하세요");
            int count = scanner.nextInt();
            if (count == 3) {
                break;
            }
            switch (count) {
                case 1:
                    scanner.nextLine();
                    System.out.println("상품 이름을 입력하세요:");
                    productNames[productCount] = scanner.nextLine();
                    System.out.println("상품 가격을 입력하세요:");
                    productPrices[productCount] = scanner.nextInt();
                    productCount++;
                    break;
                case 2:
                    for (int i = 0; i < productCount; i++) {
                        System.out.println(productNames[i] + ": " + productPrices[i]);
                    }
                    break;


            }
        }

    }

}
