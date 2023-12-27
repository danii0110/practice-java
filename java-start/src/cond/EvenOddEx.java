package cond;

public class EvenOddEx {
    public static void main(String[] args) {
//        int x = 3;
//        if (x % 2 == 0) {
//            System.out.println("x = " + x + ", 짝수");
//        } else {
//            System.out.println("x = " + x + ", 홀수");
//        }

        int x = 2;
        String res = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + res);
    }
}
