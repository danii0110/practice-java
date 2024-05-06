package oop1.ex;

public class AccountMain_p1 {
    public static void main(String[] args) {
        Account_p1 accountP1 = new Account_p1();
        accountP1.deposit(10000);
        accountP1.withdraw(9000);
        accountP1.withdraw(2000);
        System.out.println("잔고: " + accountP1.balance);
    }
}
