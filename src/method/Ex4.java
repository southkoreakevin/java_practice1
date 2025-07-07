package method;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 10000;
        while (true) {
            int count;
            int number;
            System.out.println("-----------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액확인 | 4. 종료");
            System.out.println("-----------------------------");
            count = scanner.nextInt();
            if (count == 4) {
                break;
            }
            switch (count) {
                case 1:
                    System.out.print("입금액을 선택하세요: ");
                    number = scanner.nextInt();
                    balance = deposit(balance, number);
                    break;
                case 2:
                    System.out.print("출금액을 선택하세요: ");
                    number = scanner.nextInt();
                    balance = withdraw(balance, number);
                    break;
                case 3:
                    System.out.println("잔액 : " + balance);
                    break;

            }
        }
    }

    public static int deposit(int balance, int depositAmount) {
        System.out.println("입금 " + depositAmount);
        return balance + depositAmount;
    }

    public static int withdraw(int balance, int withdrawAmount) {
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
        return balance;
    }

}
