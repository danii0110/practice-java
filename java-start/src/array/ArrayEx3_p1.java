package array;

import java.util.*;

public class ArrayEx3_p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = new Integer[5];

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);

        System.out.println("입력한 정수를 역순으로 출력");
        System.out.println(list);
    }
}
