package method;

public class MethodReturn1_p1 {
    public static void main(String[] args) {
        boolean res = odd(2);
        System.out.println("res = " + res);
    }
    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
