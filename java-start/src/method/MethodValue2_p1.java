package method;

public class MethodValue2_p1 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("1. changeNumber 호출 전, num = " + num);
        changeNumber(num);
        System.out.println("4,. changeNumber 호출 후, num = " + num);
    }
    public static void changeNumber(int num) {
        System.out.println("2. changeNumber 변경 전, num = " + num);
        num = num * 2;
        System.out.println("3. changeNumber 변경 후, num = " + num);
    }
}
