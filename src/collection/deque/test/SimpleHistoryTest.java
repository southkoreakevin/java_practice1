package collection.deque.test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class SimpleHistoryTest {

    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();

        //push , pop

        stack.push("youtube.com");
        stack.push("google.com");
        stack.push("facebook.com");

        System.out.println("stack = " + stack.pop());
        System.out.println("stack = " + stack.pop());
        System.out.println("stack = " + stack.pop());
//        System.out.println(stack);
    }


}
