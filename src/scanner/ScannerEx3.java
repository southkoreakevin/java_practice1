package scanner;

import java.util.Scanner;

public class ScannerEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String foodName = scanner.nextLine();
        int foodPrice = scanner.nextInt();
        int foodQuantity = scanner.nextInt();
        int totalPrice = foodPrice * foodQuantity;

        System.out.println(
            foodName + " " + foodQuantity + "를 주문하셨습니다. 총 가격은 " + totalPrice + "원 입니다.");
    }

}
