package method;

public class Ex3 {

    public static void main(String[] args) {
        int balance = 10000;
        balance = deposit(balance, 2000);
        System.out.println(balance);
        balance = withdraw(balance, 3000);
        System.out.println(balance);

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
