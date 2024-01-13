package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        //NullPointerException
        System.out.println("bigData.data.value = " + bigData.data.value);
        //예외 발생 과정
        //bigData.data.value
        //x001.data.value //bigData는 x001 참조값을 가진다.
        //null.value //x001.data는 null값을 가진다.
        //NullPointerException //null값에 .(dot)을 찍으면 예외가 발생한다.
    }
}
