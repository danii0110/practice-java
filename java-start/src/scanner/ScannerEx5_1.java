package scanner;

import java.util.Scanner;

public class ScannerEx5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bigger, smaller;

        System.out.print("첫 번째 숫자를 입력하세요:");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요:");
        int num2 = scanner.nextInt();

        if(num1 > num2) {
            bigger = num1;
            smaller = num2;
        }
        else {
            bigger = num2;
            smaller = num1;
        }

        System.out.print("두 숫자 사이의 모든 정수:");
        for(int i = smaller; i <= bigger; i++) {
            if(i != bigger) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }


    }
}
