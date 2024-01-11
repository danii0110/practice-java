package method;

public class MethodEx2Ref {
    public static void main(String[] args) {
        messageRepeat(3);
        messageRepeat(5);
        messageRepeat(7);
    }

    public static void messageRepeat(int count) {
        String message = "Hello, world!";

        for(int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}
