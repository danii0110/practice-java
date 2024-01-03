package scanner;

import java.util.Scanner;

public class ChangeVarEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 10, b = 20;
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("a b: " + a + " " + b);
    }
}
