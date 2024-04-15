package array;

import java.util.Scanner;

public class ArrayEx8_p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생수를 입력하세요:");
        int n = sc.nextInt();

        int[][] score = new int[n][3];
        int[] sum = {0, 0, 0, 0};
        double[] average= new double[n];

        for (int i = 0; i < score.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            System.out.print("국어 점수:");
            score[i][0] = sc.nextInt();
            System.out.print("영어 점수:");
            score[i][1] = sc.nextInt();
            System.out.print("수학 점수:");
            score[i][2] = sc.nextInt();

            sum[i] = score[i][0] + score[i][1] + score[i][2];
            average[i] = (double) sum[i] / 3;
        }
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "번 학생의 총점: " + sum[i] + ", 평균: " + average[i]);
        }
    }
}
