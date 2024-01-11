package method;

public class MethodEx2Ref_0 {
    public static void main(String[] args) {
        messageRepeat("Hello, world!", 3);
        messageRepeat("Hello, world!", 5);
        messageRepeat("Hello, world!", 7);
    }

    public static void messageRepeat(String message, int count) {
        for(int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}
