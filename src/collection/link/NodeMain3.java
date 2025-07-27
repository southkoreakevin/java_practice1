package collection.link;

public class NodeMain3 {

    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        System.out.println("모든 노드 탐색하기");
        printAll(first);

        //마지막 노드 조회하기
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        //특정 index 의 노드 조회하기
        int index = 1;
        Node index2Node = getNode(first, index);
        System.out.println("index2Node = " + index2Node.item);

        System.out.println("데이터 추가하기");
        add(first, "D");
        printAll(first);
        add(first, "E");
        printAll(first);


    }

    private static void add(Node first, String d) {
        Node lastNode = getLastNode(first);
        lastNode.next = new Node(d);
    }

    private static Node getNode(Node first, int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    private static void printAll(Node first) {
        System.out.println(first.item);
        Node x = first;
        while (x.next != null) {
            x = x.next;
            System.out.println(x.item);
        }
    }

}
