package scanner;

import java.util.Scanner;

public class ScannerWhileEx4_p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        while(true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = sc.nextInt();
            if (option == 1) {
                sc.nextLine(); //이전에 입력된 개행문자 제거

                System.out.print("상품명을 입력하세요: ");
                String product = sc.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = sc.nextInt();
                sc.nextLine();

                System.out.print("구매 수량을 입력하세요: ");
                int amount = sc.nextInt();
                sc.nextLine();

                total = price * amount;
            } else if (option == 2) {
                System.out.println("total = " + total);
                total = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
