package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    Deque<String> deque = new ArrayDeque<>();
    private String currentPage = null;


    public void visitPage(String s) {
        if (currentPage != null) {
            deque.push(s);
        }
        currentPage = s;
        System.out.println("방문: " + s);
    }

    public String goBack() {
        if (!deque.isEmpty()) {
            currentPage = deque.pop();
            System.out.println("뒤로 가기: " + currentPage);
            return currentPage;
            
        }
        return null;
    }
}
