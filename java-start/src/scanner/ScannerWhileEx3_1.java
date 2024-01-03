package scanner;

import java.util.Scanner;

public class ScannerWhileEx3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0, num = 0;
        double average;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");
        while(true) {
            int temp = scanner.nextInt();

            if (temp == -1) {
                average = (double)sum / (double) num;
                System.out.println("입력한 숫자들의 합계: " + sum);
                System.out.println("입력한 숫자들의 평균: " + average);
                break;
            } else {
                num++;
                sum += temp;
            }
        }
    }
}
