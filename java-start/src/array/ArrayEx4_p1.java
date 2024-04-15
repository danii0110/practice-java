package array;

import java.util.Scanner;

public class ArrayEx4_p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double average = sum / arr.length;
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
