package method;

public class Method1Ref_p1 {
    public static void main(String[] args) {
        int sum1 = add(5, 10);
        System.out.println("sum1 = " + sum1);

        int sum2 = add(15, 20);
        System.out.println("sum2 = " + sum2);
    }
    //add 메서드
    public static int add(int a, int b) {
        System.out.println(a + " + " + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }
}
