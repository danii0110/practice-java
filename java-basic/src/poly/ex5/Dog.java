package poly.ex5;

public class Dog implements InterfaceAnimal{ //단축키: option enter
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지 이동");
    }
}
