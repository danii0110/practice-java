package ref;

public class NullMain4_p1 {
    public static void main(String[] args) {
        BigData_p1 bigData = new BigData_p1();
        bigData.data = new Data_p1();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
