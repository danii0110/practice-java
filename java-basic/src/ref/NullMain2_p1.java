package ref;

public class NullMain2_p1 {
    public static void main(String[] args) {
        Data_p1 data = null;
        data.value = 10; //NullPointerException 예외 발생
        System.out.println("data.value = " + data.value);
    }
}
