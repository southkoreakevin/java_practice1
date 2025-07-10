package oop.ex;

public class Account {

    int balance = 0;

    void deposit(int amount) {
        this.balance += amount;
        System.out.println("입금 후 잔액 : " + this.balance);
    }

    void withdraw(int amount) {
        if (this.balance < amount) {
            System.out.println("=========잔액부족========");
            return;
        }
        this.balance -= amount;
        System.out.println("withdraw후 잔액: " + this.balance);
        return;
    }
}
