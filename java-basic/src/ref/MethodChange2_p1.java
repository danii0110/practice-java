package ref;

public class MethodChange2_p1 {
    public static void main(String[] args) {
        Data_p1 dataA = new Data_p1();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        changeReference(dataA);
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value);
    }
    static void changeReference(Data_p1 dataX) {
        dataX.value = 20;
    }
}
