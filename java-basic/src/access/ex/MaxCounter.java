package access.ex;

public class MaxCounter {
    //최대값을 지정하고 최대값까지만 증가하는 기능을 제공
    private int count;
    private int max;

    public MaxCounter(int max) {
        count = 0;
        this.max = max;
    }
    public void increment() {
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;
    }
    public int getCount() {
        return count;
    }
}
