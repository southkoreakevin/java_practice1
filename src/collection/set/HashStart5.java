package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }

        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9);

        System.out.println("buckets = " + Arrays.toString(buckets));

        //search
        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("buckets.contains(" + searchValue + ") =" + contains);

    }

    private static void add(LinkedList<Integer>[] buckets, int i) {
        int hashIndex = hashIndex(i);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if (!bucket.contains(i)) {
            bucket.add(i);
        }

    }


    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);

    }

    static int hashIndex(int i) {
        return i % CAPACITY;
    }

}
