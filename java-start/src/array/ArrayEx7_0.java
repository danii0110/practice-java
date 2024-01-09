package array;

import java.util.Scanner;

public class ArrayEx7_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] num = new int[4][3];
        int[] total = new int[4];
        double[] average = new double[4];

        for (int i = 0; i < num.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < num[i].length; j++) {
                if (j == 0) {
                    System.out.print("국어 점수:");
                    num[i][j] = scanner.nextInt();
                    total[i] += num[i][j];
                } else if (j == 1) {
                    System.out.print("영어 점수:");
                    num[i][j] = scanner.nextInt();
                    total[i] += num[i][j];
                } else {
                    System.out.print("수학 점수:");
                    num[i][j] = scanner.nextInt();
                    total[i] += num[i][j];
                }
                average[i] = (double) total[i] / 3;
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println((num.length + 1) + "번 학생의 총점: " + total[i] + ", 평균: " + average[i]);
        }
    }
}
