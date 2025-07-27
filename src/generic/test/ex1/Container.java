package generic.test.ex1;

public class Container<T> {

    private T data;

    public boolean isEmpty() {
        if (data == null) {
            return true;
        }
        return false;
    }

    public void setItem(T data) {
        this.data = data;
    }

    public T getItem() {
        return data;
    }
}
