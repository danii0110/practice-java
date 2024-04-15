package array;

import java.util.Scanner;

public class ArrayEx5_p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int n = sc.nextInt();
        int sum = 0;

        int[] arr = new int[n];
        System.out.println(n + "개의 정수를 입력하세요:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double average = sum / n;
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
