package scanner;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int sum = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();
            scanner.nextLine(); //이전에 입력된 개행문자 제거

            if(option == 1) {
                System.out.print("상품명을 입력하세요: ");
                String product = scanner.nextLine();
                System.out.print("상품의 가격을 입력하세요: ");
                int price = scanner.nextInt();
                System.out.print("구매 수량을 입력하세요: ");
                int amount = scanner.nextInt();
                sum += price * amount;
                System.out.println("상품명: " + product + " 가격: " + price + " 수량: " + amount + " 합계: " + sum);
            } else if (option == 2) {
                if (sum == 0) {
                    System.out.println("상품을 입력하시오.");
                } else {
                    System.out.println("총 비용: " + sum);
                }
            } else if (option == 3) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
