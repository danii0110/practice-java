package ref;

public class InitMain_p1 {
    public static void main(String[] args) {
        InitData_p1 data = new InitData_p1();

        //value1은 초기값을 지정하지 않았지만 멤버 변수는 자동으로 초기화된다. 숫자는 0으로 초기화된다.
        System.out.println("data.value1 = " + data.value1);

        //value2는 10으로 초기값을 지정해두었기 때문에 객체를 생성할 때 10으로 초기화된다.
        System.out.println("data.value2 = " + data.value2);
    }
}
