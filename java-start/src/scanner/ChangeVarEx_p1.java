package scanner;

public class ChangeVarEx_p1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
