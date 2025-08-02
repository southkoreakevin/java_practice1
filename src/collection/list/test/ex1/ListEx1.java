package collection.list.test.ex1;

import java.util.Arrays;

public class ListEx1 {

    private static final int SIZE = 10;
    private int arr[];
    private int size = 0;

    public ListEx1() {
        arr = new int[SIZE];

    }

    public ListEx1(int size) {
        arr = new int[size];
    }

    public void add(Integer integer) {
        if (size == arr.length) {
            grow();
        }
        arr[size] = integer;
        size++;
    }

    private void grow() {
        int new_size = size * 2;
        arr = Arrays.copyOf(arr, new_size);
    }

    public int getsize() {
        return size;
    }

    public int get(int i) {
        return arr[i];
    }
}
