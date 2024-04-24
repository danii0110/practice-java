package ref;

public class NullMain1_p1 {
    public static void main(String[] args) {
        Data_p1 data = null;
        System.out.println("1. data = " + data);
        data = new Data_p1();
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);
    }
}
