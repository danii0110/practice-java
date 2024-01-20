package extends1.super2;

public class ClassC extends ClassB{
    public ClassC() {
        super(10, 20); //기본 생성자가 아니기 때문에 내가 super()를 직접 정해야 된다.
        System.out.println("ClassC 생성자");
    }
}
