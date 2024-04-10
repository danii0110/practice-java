package scanner;

import java.util.Scanner;

public class ScannerWhile3_p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while(true) {
            int num = sc.nextInt();
            if (num == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            sum += num;
        }
        System.out.println("sum = " + sum);
    }
}
