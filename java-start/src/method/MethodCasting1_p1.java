package method;

public class MethodCasting1_p1 {
    public static void main(String[] args) {
        double num = 1.5;
        printNumber((int) num); //명시적 형변환을 사용해 double을 int로 변환
    }
    public static void printNumber(int n) {
        System.out.println("n = " + n);
    }
}
