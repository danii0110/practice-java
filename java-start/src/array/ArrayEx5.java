package array;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int inputNum = scanner.nextInt();
        int[] numbers = new int[inputNum];
        int total = 0;

        System.out.println(inputNum + "개의 정수를 입력하세요:");
        for(int i = 0; i< inputNum; i++) {
            numbers[i] = scanner.nextInt();
            total += numbers[i];
        }

        System.out.println("입력한 정수의 합계: " + total);
        double average = (double)total / inputNum;
        System.out.println("입력한 정수의 평균: " + average);
    }
}
