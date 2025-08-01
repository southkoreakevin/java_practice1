package collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        char charA = 'A';
        char charB = 'B';
        System.out.println(charA + "=" + (int) charA);
        System.out.println(charB + "=" + (int) charB);

        //hashCode
        System.out.println("hashCode(A) = " + hashCode("A"));
        System.out.println("hashCode(A) = " + hashCode("B"));
        System.out.println("hashCode(A) = " + hashCode("AB"));

        System.out.println("hashIndex(A)" + hashIndex(hashCode("A")));
        System.out.println("hashIndex(B)" + hashIndex(hashCode("B")));
        System.out.println("hashIndex(AB)" + hashIndex(hashCode("AB")));

    }

    static int hashCode(String a) {
        char[] charArray = a.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += c;
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }

}
