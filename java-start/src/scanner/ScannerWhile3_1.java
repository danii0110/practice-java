package scanner;

import java.util.Scanner;

public class ScannerWhile3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while(true) {
            System.out.print("숫자를 입력하시오: ");
            int temp = scanner.nextInt();

            if(temp == 0) {
                System.out.println("총 합계: " + sum);
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                sum += temp;
            }
        }
    }
}
