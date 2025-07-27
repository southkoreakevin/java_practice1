package generic.test.ex2;

public class Pair<T, T1> {

    private T data1;
    private T1 data2;

    public void setData1(T data1) {
        this.data1 = data1;
    }

    public void setData2(T1 data2) {
        this.data2 = data2;
    }

    public T getData1() {
        return data1;
    }

    public T1 getData2() {
        return data2;
    }

    @Override
    public String toString() {
        return "Pair{" +
            "data1=" + data1 +
            ", data2=" + data2 +
            '}';
    }
}
