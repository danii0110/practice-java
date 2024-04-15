package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx2_p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("출력");
        System.out.println(Arrays.toString(arr));
    }
}
