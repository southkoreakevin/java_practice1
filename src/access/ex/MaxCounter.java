package access.ex;

public class MaxCounter {

    private int count;
    private int max;

    public MaxCounter(int max) {
        this.count = 0;
        this.max = max;
    }

    public void increment() {
        if (this.count < max) {
            this.count++;
        } else {
            return;
        }
    }

    public int getCount() {
        return this.count;
    }
}
