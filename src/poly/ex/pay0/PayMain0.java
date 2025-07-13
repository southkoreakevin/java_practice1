package poly.ex.pay0;

import java.util.Scanner;

public class PayMain0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayService payService = new PayService();

        while (true) {

            System.out.print("결제 수단을 입력하세요: ");

            String option = scanner.nextLine();
            if (option.equals("exit")) {
                break;

            }
            System.out.print("결제 금액을 입력하세요: ");
            int amount = scanner.nextInt();
            scanner.nextLine();

            payService.processPay(option, amount);
        }

    }

}
