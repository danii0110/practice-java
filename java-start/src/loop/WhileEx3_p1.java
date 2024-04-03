package loop;

public class WhileEx3_p1 {
    public static void main(String[] args) {
        int max = 100;
        int sum = 0;
        while(max > 0) {
            sum += max;
            max--;
        }
        System.out.println(sum);
    }
}
