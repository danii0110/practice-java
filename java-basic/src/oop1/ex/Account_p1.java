package oop1.ex;

public class Account_p1 {
    int balance;
    void deposit(int amount) {
        balance += amount;
    }
    void withdraw(int amount) {
        if(balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액 부족");
        }
    }
}
